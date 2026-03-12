import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CycleMetrics {

    static class User {
        String name;
        double weightKg;
        double heightCm;
        String sex; // "M" or "F"
        double ftp; // Functional Threshold Power (watts)
        List<Workout> workouts = new ArrayList<>();

        User(String name, double weightKg, double heightCm, String sex) {
            this.name      = name;
            this.weightKg  = weightKg;
            this.heightCm  = heightCm;
            this.sex       = sex;
            this.ftp       = 0;
        }
    }

    static class Workout {
        double distanceKm;
        double avgSpeedKmh;
        double avgPowerWatts;
        double kcalBurned;
        String perceivedEffort;

        Workout(double distanceKm, double avgSpeedKmh, double avgPowerWatts) {
            this.distanceKm    = distanceKm;
            this.avgSpeedKmh   = avgSpeedKmh;
            this.avgPowerWatts = avgPowerWatts;
        }
    }

    // ─────────────────────────────────────────────
    //  Correcao input
    // ─────────────────────────────────────────────

    /**
     * Estimates kcal burned using the MET-based approach for cycling.
     *
     * MET is approximated from average speed:
     *   < 16 km/h  → MET 4.0  (light effort)
     *   16–19 km/h → MET 6.0  (moderate effort)
     *   19–22 km/h → MET 8.0  (vigorous effort)
     *   22–25 km/h → MET 10.0 (racing / very vigorous)
     *   > 25 km/h  → MET 12.0 (elite pace)
     *
     * Power correction:  if avgPowerWatts is provided we refine the estimate
     *   because kcal ≈ power (W) × duration (h) × 3.6 / efficiency (≈0.25)
     *
     * We use the higher of the two estimates for a conservative recommendation.
     */
    static double calculateKcal(User user, Workout w) {
        double durationHours = w.distanceKm / w.avgSpeedKmh;

        // MET-based
        double met;
        if      (w.avgSpeedKmh < 16) met = 4.0;
        else if (w.avgSpeedKmh < 19) met = 6.0;
        else if (w.avgSpeedKmh < 22) met = 8.0;
        else if (w.avgSpeedKmh < 25) met = 10.0;
        else                          met = 12.0;

        // Sex correction: women burn ~5-8 % fewer kcal at same MET
        if (user.sex.equalsIgnoreCase("F")) met *= 0.95;

        double kcalMet = met * user.weightKg * durationHours;

        // Power-based (mechanical efficiency ≈ 0.25)
        double kcalPower = w.avgPowerWatts * durationHours * 3600 / 1000.0 / 0.25;

        return Math.max(kcalMet, kcalPower);
    }

    /**
     * Water recommendation: 500–750 ml/hour baseline, +200 ml if power > 200 W.
     * Adjusted by body weight (heavier riders sweat more).
     */
    static double recommendWaterMl(User user, Workout w) {
        double durationHours = w.distanceKm / w.avgSpeedKmh;
        double basePerHour   = 600 + (user.weightKg - 70) * 5; // ml/h
        if (w.avgPowerWatts > 200) basePerHour += 200;
        return basePerHour * durationHours;
    }

    /**
     * Carbohydrate recommendation:
     *   < 60 min  → 30 g/h
     *   60–90 min → 45 g/h
     *   > 90 min  → 60 g/h
     */
    static double recommendCarbsG(Workout w) {
        double durationHours = w.distanceKm / w.avgSpeedKmh;
        double durationMin   = durationHours * 60;
        double carbsPerHour;
        if      (durationMin < 60)  carbsPerHour = 30;
        else if (durationMin < 90)  carbsPerHour = 45;
        else                         carbsPerHour = 60;
        return carbsPerHour * durationHours;
    }

    /**
     * FTP is estimated as 95 % of the average power across all workouts.
     * (A more precise method is a 20-min all-out test, but this serves as
     *  a running estimate from training data.)
     */
    static double calculateFtp(User user) {
        if (user.workouts.isEmpty()) return 0;
        double sum = 0;
        for (Workout w : user.workouts) sum += w.avgPowerWatts;
        return (sum / user.workouts.size()) * 0.95;
    }

    /**
     * FTP adjustment based on perceived effort.
     * "Easy" workout → athlete has headroom → increase FTP by 2 %.
     */
    static double adjustFtpByEffort(double ftp, String effort) {
        if (effort.equalsIgnoreCase("easy")) {
            return ftp * 1.02;
        }
        return ftp;
    }

    // ─────────────────────────────────────────────
    //  Input helpers
    // ─────────────────────────────────────────────

    static double readDouble(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                double v = Double.parseDouble(sc.nextLine().trim());
                if (v > 0) return v;
                System.out.println("  ⚠ Value must be positive. Try again.");
            } catch (NumberFormatException e) {
                System.out.println("  ⚠ Invalid number. Try again.");
            }
        }
    }

    static String readSex(Scanner sc) {
        while (true) {
            System.out.print("Sexo (M/F): ");
            String s = sc.nextLine().trim().toUpperCase();
            if (s.equals("M") || s.equals("F")) return s;
            System.out.println("  Por favor digite M ou F.");
        }
    }

    static String readEffort(Scanner sc) {
        String[] valid = {"easy", "moderate", "hard", "very hard"};
        while (true) {
            System.out.print("Como voce se sentiu? (easy / moderate / hard / very hard): ");
            String input = sc.nextLine().trim().toLowerCase();
            for (String v : valid) if (v.equals(input)) return input;
            System.out.println("  Por favor digite: easy, moderate, hard, very hard.");
        }
    }

    static String readYesNo(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt + " (y/n): ");
            String s = sc.nextLine().trim().toLowerCase();
            if (s.equals("y") || s.equals("n")) return s;
        }
    }

    // ─────────────────────────────────────────────
    //  Principal
    // ─────────────────────────────────────────────

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║        🚴   Cycle Metrics            ║");
        System.out.println("╚══════════════════════════════════════╝\n");

        // ── 1. Registro usuario  ──────────────────────────────────────────
        System.out.println("[ REGISTRO DO USUÁRIO ]");
        System.out.print("Nome: ");
        String name = sc.nextLine().trim();

        double weight = readDouble(sc, "Peso (kg): ");
        double height = readDouble(sc, "Altura (cm): ");
        String sex    = readSex(sc);

        User user = new User(name, weight, height, sex);
        System.out.printf("Bem vindo, %s! Perfil salvo.%n", user.name);

        // ── 2. Loop treino ───────────────────────────────────────────
        boolean addMore = true;
        while (addMore) {
            System.out.println("\n──────────────────────────────────────");
            System.out.println("[ NOVO TREINO ]");

            double distance = readDouble(sc, "Distancia total (km): ");
            double speed    = readDouble(sc, "Velocidade media (km/h): ");
            double power    = readDouble(sc, "Potencia media (watts): ");

            Workout w = new Workout(distance, speed, power);

            // ── 3. Calculos ───────────────────────────────────────
            double kcal  = calculateKcal(user, w);
            double water = recommendWaterMl(user, w);
            double carbs = recommendCarbsG(w);

            w.kcalBurned = kcal;

            double durationMin = (distance / speed) * 60;

            System.out.println("\n[ RESUMO DO TREINO ]");
            System.out.printf("  Duracao         : %.1f min%n", durationMin);
            System.out.printf("  Calorias queimadas  : %.0f kcal%n", kcal);
            System.out.println("\n[ RECOMENDAÇÕES DE NUTRICAO E HIDRATAÇÃO ]");
            System.out.printf("  💧 Agua         : %.0f ml  (%.1f garrafas de 500 ml)%n",
                    water, water / 500.0);
            System.out.printf("  🍌 Carboidratos : %.0f g%n", carbs);
            System.out.println("     (ex. Géis de carboidrato, bananas, isotônicos)");

            // ── 4. Percepcao de esforco e FTP ──────────────────
            String effort = readEffort(sc);
            w.perceivedEffort = effort;

            user.workouts.add(w);

            // Calculando FTP de todos os treinos
            user.ftp = calculateFtp(user);

            // Ajuste de FTP se facil
            double ftpBeforeAdjust = user.ftp;
            user.ftp = adjustFtpByEffort(user.ftp, effort);

            System.out.println("\n[ FTP UPDATE ]");
            System.out.printf("   FTP estimado   : %.1f W%n", ftpBeforeAdjust);
            if (effort.equalsIgnoreCase("easy")) {
                System.out.printf("  →  %.1f W  (+2%% bonus treino fácil%n", user.ftp);
            } else {
                System.out.println("  (Sem ajustes)");
            }
            System.out.printf("  FTP Atual      : %.1f W%n", user.ftp);

            // Zonas de potenica baseado em FTP
            System.out.println("\n[ ZONAS DE POTENCIA  (baseado no FTP atual) ]");
            printPowerZones(user.ftp);

            addMore = readYesNo(sc, "\nRegistrar um novo treino?").equals("y");
        }

        // ── 5. Resumo treino  ────────────────────────────────────────
        System.out.println("\n══════════════════════════════════════════");
        System.out.println("[ RESUMO DO TREINO — " + user.name.toUpperCase() + " ]");
        System.out.printf("  Total de treinos   : %d%n", user.workouts.size());
        double totalKcal = user.workouts.stream().mapToDouble(w -> w.kcalBurned).sum();
        double totalDist = user.workouts.stream().mapToDouble(w -> w.distanceKm).sum();
        System.out.printf("  Distancia total  : %.1f km%n", totalDist);
        System.out.printf("  Calorias totais      : %.0f kcal%n", totalKcal);
        System.out.printf("  FTP Final        : %.1f W%n", user.ftp);

        System.out.println("\nContinue pedalando! 🚴‍♂️");
        sc.close();
    }

    // ─────────────────────────────────────────────
    //  Display potencia
    // ─────────────────────────────────────────────

    static void printPowerZones(double ftp) {
        if (ftp <= 0) {
            System.out.println("  (Not enough data to calculate zones)");
            return;
        }
        String[] zoneNames = {
                "Z1 – Active Recovery",
                "Z2 – Endurance",
                "Z3 – Tempo",
                "Z4 – Lactate Threshold",
                "Z5 – VO2 Max",
                "Z6 – Anaerobic Capacity",
                "Z7 – Neuromuscular"
        };
        double[] lower = { 0,   0.56, 0.76, 0.91, 1.06, 1.21, 1.51 };
        double[] upper = { 0.55, 0.75, 0.90, 1.05, 1.20, 1.50, 99   };

        for (int i = 0; i < zoneNames.length; i++) {
            int lo = (int) (lower[i] * ftp);
            if (i == zoneNames.length - 1) {
                System.out.printf("  %-30s  > %d W%n", zoneNames[i], lo);
            } else {
                int hi = (int) (upper[i] * ftp);
                System.out.printf("  %-30s  %d – %d W%n", zoneNames[i], lo, hi);
            }
        }
    }
}