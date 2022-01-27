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
    }

}
