package homework_2_if_else.conditions;

public class main {

    public static void main(String[] args) {
        System.out.println("Задача 1");

        int clientOperS = 1;
        if (clientOperS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        }
        System.out.println();

        System.out.println("Задача 2");
        int clientOS = 1;
        int clientDeviceYear = 2015;
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else if (clientOS == 0 && clientDeviceYear >= 2015){
            System.out.println("Установите версию приложения для iOS по ссылке.");
        }
        if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        System.out.println();

        System.out.println("Задача 3");

        int year = 400;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("год является високосным");
        } else {
            System.out.println("год не является високосным");
        }

        System.out.println();

        System.out.println("Задача 4");

        int deliveryDistance = 95;
        int deliveryDay = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней " + deliveryDay);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней " + ++deliveryDay);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней " + (deliveryDay+2));
        }

        System.out.println();

        System.out.println("Задача 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("There is no such number");
        }

        System.out.println();

        System.out.println("Задача 6");

        int age1 = 19;
        int salary1 = 58_000;
        double limit = 1;
        if (age1 >= 23) {
            limit = salary1 * 3;
        } else if (age1 < 23) {
            limit = salary1 * 2;
        }
        if (salary1 >= 50000 && salary1 < 80000) {
            limit = limit * 1.2;
        } else if (salary1 >= 80000) {
            limit = limit * 1.5;
        }
        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limit + " рублей");

        System.out.println();

        System.out.println("Задача 7");

        int age = 25;
        int salary = 60000;
        int wantedSum = 330000;
        int creditLength = 12;
        double basePercent = 0.1;
        double baseOffer = wantedSum * basePercent;
        float maxMonthlyPayment = salary * 0.5f;
        if (age <= 23) {
            baseOffer = baseOffer + (baseOffer * 0.01);
        } else if (age <= 30) {
            baseOffer = baseOffer + (baseOffer * 0.05);
        }
        if (salary > 80000) {
            baseOffer = baseOffer - (baseOffer * 0.07);
        }
        double monthlyPayment = (wantedSum + baseOffer)/creditLength;
        if (maxMonthlyPayment > monthlyPayment) {
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxMonthlyPayment +
                    " рублей." + "Платеж по кредиту " + monthlyPayment + " рублей. Одобрено».");
        } else if (maxMonthlyPayment < monthlyPayment) {
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxMonthlyPayment +
                    " рублей." + "Платеж по кредиту " + monthlyPayment + " рублей. Отказано».");
        }


    }

}
