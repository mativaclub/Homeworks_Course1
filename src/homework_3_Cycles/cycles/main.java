package homework_3_Cycles.cycles;

public class main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        int a = 1;
        while (a <= 10) {
            System.out.print(a++);
        }
        System.out.println();
        for (int i = 10; i >=1 ; i--) {
            System.out.print(i);
        }
        System.out.println();
        System.out.println();

        System.out.println("Задание 2");
        for (int day = 5; day <= 31; day+=7) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет.");
        }

        System.out.println();

        System.out.println("Задание 3");
        int currentYear = 2021;
        int yearsBefore = currentYear - 200;
        int yearsAfter = currentYear + 100;
        for (int cometYear = yearsBefore; cometYear <= yearsAfter; cometYear++) {
            if (cometYear % 79 == 0) {
                System.out.println(cometYear);
            }
        }
        System.out.println();

        System.out.println("Задание 4");
        for (int day = 1; day <= 30; day++) {
            if (day % 3 == 0 && day % 5 == 0) {
                System.out.println(day + ":ping pong");
            } else if (day % 3 == 0) {
                System.out.println(day + ":ping");
            } else if (day % 5 == 0) {
                System.out.println(day + ":pong");
            } else {
                System.out.println(day + ":");
            }
        }

        System.out.println();

        System.out.println("Задание 5");
        int evenNumber = 0;
        int oddNumber = 1;
        for (int nextNumber = 0; nextNumber < 5; nextNumber++) {
            System.out.print(evenNumber + " " + oddNumber + " ");
            evenNumber = evenNumber + oddNumber;
            oddNumber = oddNumber + evenNumber;
        }


}
}
