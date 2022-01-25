package homewrok_1_Variables.Variables;

public class Main {

    public static void main(String[] args) {

        System.out.print("Задача 1");
        byte by = 10;
        short s = 32_767;
        int i = 2_147_483_647;
        long l = 9_223_372_036_854_775_807L;
        float f = 9_999_999_999_999_999_997.77777777f;
        double db = 9_999_999_999_999_999_999_997.9777777777;
        char ch = 20000;
        int age = 20;
        boolean adult = age > 18;
        System.out.println("\n" + by + " " + s + "\n");

        System.out.println("Задача 2");
        float boxer1 = 78.2f;
        float boxer2 = 82.7f;
        float totalWeight = boxer1 + boxer2;
        float weightDifference = Math.abs(boxer1 - boxer2);
        System.out.println("Total Weight is " + totalWeight);
        System.out.println("Weight Difference is " + weightDifference);
        System.out.println();

        System.out.println("Задача 3");
        int bananasWeightGr = 80;
        byte bananasQty = 5;
        int totalBananasWeight = bananasWeightGr * bananasQty;
        int milkVolumeGrPer100Ml = 105;
        int milkVolumePerML = 200;
        int totalMilkVolume = (milkVolumeGrPer100Ml * milkVolumePerML)/100;
        int iceCreamWeightGr = 100;
        int iceCreamQty = 2;
        int totalIceCreamWeight = iceCreamWeightGr * iceCreamQty;
        int eggsWeight = 70;
        int eggsQty = 4;
        int totalEggsWeightWeight = eggsWeight * eggsQty;
        float totalBreakfastWeight = totalBananasWeight + totalMilkVolume +
                totalIceCreamWeight + totalEggsWeightWeight;
        float grToKg = totalBreakfastWeight/1000;
        System.out.println("Breakfast weight is " + grToKg + " kg");
        System.out.println();

        System.out.println("Задача 4");
        int weightToLooseKg = 7;
        int kgToGr = weightToLooseKg * 1000;
        int loose250GrPerDay = 250;
        int loose500GrPerDay = 500;
        int howManyDaysIf250Gr = kgToGr / loose250GrPerDay;
        int howManyDaysIf500Gr = kgToGr / loose500GrPerDay;
        System.out.println("Will take " + howManyDaysIf250Gr + " days");
        System.out.println("Will take " + howManyDaysIf500Gr + " days");
        int totalApproximateDays = (howManyDaysIf250Gr + howManyDaysIf500Gr)/2;
        System.out.println("Approximate days " + totalApproximateDays);
        System.out.println();

        System.out.println("Задача 5");
        int months = 12;
        float percentPerMonth = 0.1f;
        int mashaOldSalary = 67760;
        float mashaNewSalary = mashaOldSalary + (mashaOldSalary * percentPerMonth);
        float mashaSalaryDifference = mashaNewSalary - mashaOldSalary;
        float mashaSalaryDifferencePerYear = mashaSalaryDifference * months;
        int denisOldSalary = 83690;
        float denisNewSalary = denisOldSalary + (denisOldSalary * percentPerMonth);
        float denisSalaryDifference = denisNewSalary - denisOldSalary;
        float denisSalaryDifferencePerYear = denisSalaryDifference * months;
        int kristinaOldSalary = 76230;
        float kristinaNewSalary = kristinaOldSalary + (kristinaOldSalary * percentPerMonth);
        float kristinaSalaryDifference = kristinaNewSalary - kristinaOldSalary;
        float kristinaSalaryDifferencePerYear = kristinaSalaryDifference * months;
        System.out.println("Маша теперь получает " + mashaNewSalary + " рублей. " +
                " Годовой доход вырос на " + mashaSalaryDifferencePerYear + " рублей");
        System.out.println("Denis теперь получает " + denisNewSalary + " рублей. " +
                " Годовой доход вырос на " + denisSalaryDifferencePerYear + " рублей");
        System.out.println("Kristina теперь получает " + kristinaNewSalary + " рублей. " +
                " Годовой доход вырос на " + kristinaSalaryDifferencePerYear + " рублей");
        System.out.println();

        System.out.println("Задача 6");
        int aa = 12;
        int bb = 27;
        int c = 44;
        int d = 15;
        int e = 9;
        int result = (aa * (bb + (c - d * e))) * (-1);
        int result1 = Math.abs(aa * (bb + (c - d * e)));
        System.out.println(result);
        System.out.println(result1);
        System.out.println();

        System.out.println("Задача 7");
        int a = 5;
        int b = 7;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a + " b = " + b);
        System.out.println();

        System.out.println("Задача 8");
        int a1 = 256;
        int b1 = (a1 % 100)/10;
        System.out.println(b1);

    }
}
