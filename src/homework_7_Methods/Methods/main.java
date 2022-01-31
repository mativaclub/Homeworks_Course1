package homework_7_Methods.Methods;

import java.util.Arrays;

public class main {

    //Homework 1
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0) && (year % 100 !=0) || (year % 400 == 0);
    }
    private static void printIsLeapYear(int year) {
        if (isLeapYear(year)) {
            System.out.println("номер года — " + year + " високосный год");
        } else {
            System.out.println("номер года — " + year + " не високосный год");
        }
    }

//===============================================================================================
//Homework 2

    public static void getClientOS(int clientOS, int currentYear) {
        if ((clientOS == 1) && currentYear < 2015) {
            System.out.println("Установите облегченную версию приложения для " + clientOS + " по ссылке");
        } else if ((clientOS == 1) && currentYear > 2015) {
            System.out.println("Установите версию приложения для " + clientOS + " по ссылке");
        } else if ((clientOS == 0) && currentYear < 2015) {
            System.out.println("Установите облегченную версию приложения для " + clientOS + " по ссылке");
        } else {
            System.out.println("Установите версию приложения для " + clientOS + " по ссылке");
        }
    }
//===============================================================================================
//Homework 3

    public static int deliveryDistance(int distance) {
        int deliveryDay = 1;
        if (distance <= 20) {
            System.out.println("Потребуется дней " + deliveryDay);
        } else if(distance > 20 && distance <= 60) {
            System.out.println("Потребуется дней " + ++deliveryDay);
        } else if (distance > 60 && distance <= 100) {
            System.out.println("Потребуется дней " + (deliveryDay + 2));
        }
        return(deliveryDay);
    }


//===============================================================================================
//Homework 4

    public static void findDuplicates(String duplicates) {
        char [] letters = duplicates.toCharArray();
        System.out.print("Found Duplicate: ");
        for(int i = 1; i < letters.length; i++) {
            if (letters[i] == letters[i-1]) {
                System.out.print(letters[i] + " ");
            }
        }
    }

    //===============================================================================================
    //homework 5
    public static void reverse (char[] reverseArr) {
        for(int i = reverseArr.length-1; i>=0; i--){
            System.out.print(reverseArr[i] + " ");
        }
    }

    public static void reverseArray (int[] reverseArr) {
        int leftIndex = 0;
        int rightIndex = reverseArr.length -1;
        while (leftIndex < rightIndex) {
            int letter = reverseArr[leftIndex];
            reverseArr[leftIndex] = reverseArr[rightIndex];
            reverseArr[rightIndex] = letter;
            leftIndex++;
            rightIndex--;
        }
        System.out.println(Arrays.toString(reverseArr));
    }



//===============================================================================================

    public static void main(String[] args) {

//Homework 1
        printIsLeapYear(2022);

//===============================================================================================
//Homework 2
        getClientOS(0, 2015);

//===============================================================================================
//Homework 3
        deliveryDistance(100);

//===============================================================================================
//Homework 4
        String signs = "aabccddefgghiijjkk";
        findDuplicates(signs);
        System.out.println();


//===============================================================================================
//Homework 5

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        reverse(reverseFullName);

        System.out.println();

        int[] reverseArr = {5, 3, 6, 8, 9};
        reverseArray(reverseArr);
//===============================================================================================
//Homework 6

//Снова вспоминаем домашнее задание по массивам. В нем была задача, которая
// требовала высчитать среднюю выплату за день.
//Нужно написать программу, которая посчитает среднее значение трат за месяц
// (то есть сумму всех трат за месяц поделить на количество дней), и
// вывести в консоль результат в формате: «Средняя сумма трат за месяц составила … рублей».
//Важно помнить: подсчет среднего значения может иметь остаток (то есть быть не целым, а дробным числом).
//Нужно сгенерировать массив, подать его в наш метод, а внутри метода
// подсчитать сумму элементов и вычислить среднее значение, которое
// нужно вернуть из метода в виде результата.
//Сложность в том, что метод нужно не просто написать, но еще и декомпозировать.
//То есть для работы этого метода нужно будет создать еще методы
// (1 или более), которые его будут обслуживать и вычислять промежуточные результаты.
// Среднее значение нужно вычислять в дробном виде, так как результат должен быть точным.



    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

}

