package homework_4_5_Arrays.Arrays;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {

        System.out.println("задача 1");

        int[] arr1 = new int[]{1, 2, 3};
        double[] arr2 = new double[]{1.57, 7.654, 9.986};
        int[] arr3 = {4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

        System.out.println();

        System.out.println("задача 2");
        int[] arr4 = new int[]{1, 2, 3};
        for (int i = 0; i < arr4.length; i++) {
            if (i == arr4.length - 1) {
                System.out.print(arr4[i]);
            } else {
                System.out.print(arr4[i] + ", ");
            }
        }
        System.out.println();
        double[] arr5 = new double[]{1.57, 7.654, 9.986};
        for (int i = 0; i < arr5.length; i++) {
            if (i == arr5.length - 1) {
                System.out.print(arr5[i]);
            } else {
                System.out.print(arr5[i] + ", ");
            }
        }
        System.out.println();
        int[] arr6 = {4, 5, 6, 7, 8, 9};
        for (int i = 0; i < arr6.length; i++) {
            if (i == arr6.length - 1) {
                System.out.print(arr6[i]);
            } else {
                System.out.print(arr6[i] + ", ");
            }
        }
        System.out.println();
        System.out.println();

        System.out.println("задача 3");
        int[] arr4Rev = new int[]{1, 2, 3};
        for (int i = arr4Rev.length-1; i >=0; i--) {
            if (i == 0) {
                System.out.print(arr4Rev[i]);
            } else if (i < arr4Rev.length)  {
                System.out.print(arr4Rev[i] + ", ");
            }
        }
        System.out.println();
        double[] arr5Rev = new double[]{1.57, 7.654, 9.986};
        for (int i = arr5Rev.length-1; i >=0; i--) {
            if (i == 0) {
                System.out.print(arr5Rev[i]);
            } else if (i < arr5Rev.length) {
                System.out.print(arr5Rev[i] + ", ");
            }
        }
        System.out.println();
        int[] arr6Rev = {4, 5, 6, 7, 8, 9};
        for (int i = arr6Rev.length-1; i >=0; i--) {
            if (i == 0) {
                System.out.print(arr6Rev[i]);
            } else if (i < arr6Rev.length) {
                System.out.print(arr6Rev[i] + ", ");
            }
        }

        System.out.println();
        System.out.println();

        System.out.println("задача 4");
        int[] arr4even = new int[]{1, 2, 3};
        for (int i = 0; i < arr4even.length; i++) {
            if (arr4even[i] % 2 !=0) {
                System.out.print(arr4even[i] + 1 + " ");
            } else {
                System.out.print(arr4even[i] + " ");
            }
        }
        System.out.println();
        System.out.println();

        System.out.println("задача 2.1");

        int[] payments = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < payments.length; i++) {
            sum = sum + payments[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        System.out.println();

        System.out.println("задача 2.2");
        int[] expenses = generateRandomArray();
        int max = expenses[0];
        int min = expenses[0];
        for (int i = 0; i < expenses.length; i++) {
            if (expenses[i] > max) {
                max = expenses[i];
            }
        }
        for (int i = 0; i < expenses.length; i++) {
            if (expenses[i] < min) {
                min = expenses[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей");

        System.out.println();

        System.out.println("задача 2.3");
        int[] sumPerMonth = generateRandomArray();
        float daySum = 0;
        for (int i = 0; i < sumPerMonth.length; i++) {
            daySum = daySum + sumPerMonth[i];
        }
        float average = daySum / (float) sumPerMonth.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");

        System.out.println();

        System.out.println("задача 2.4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >=0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
        System.out.println();

        System.out.println("задача 2.5");
        int[][] array2D = new int[3][5];
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                array2D[i][j] = 1;
            }
        }
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                System.out.print(array2D[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("задача 2.5.1");
        int[][] matrix = new int[5][5];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = 1;
                // matrix[i][matrix.length - 1 - i] = 1;
            }
        }
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("задача 2.6");
        int[] array2 = {5, 4, 3, 2, 1};
        int[] buffer = new int[array2.length];
        for (int i = 0; i < array2.length; i++) {
            buffer[i] = array2[array2.length - 1 - i];
        }
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(buffer));

        System.out.println();

        System.out.println("задача 2.7");
        int[] array3 = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(array2));
        int leftIndex1 = 0;
        int rightIndex1 = array3.length-1;
        while (leftIndex1 < rightIndex1) {
            int tmp = array3[leftIndex1];
            array3[leftIndex1] = array3[rightIndex1];
            array3[rightIndex1] = tmp;
            leftIndex1++;
            rightIndex1--;
        }
        System.out.println(Arrays.toString(array3));
        System.out.println();
        System.out.println();

        System.out.println("задача 2.8");
        int[] arr = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        int numberToFind1 = -2;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int firstNumber = arr[i];
                int secondNumber = arr[j];
                if (firstNumber + secondNumber == -2) {
                    System.out.println("Found " + firstNumber + " and " + secondNumber);
                }
            }
        }
        System.out.println("задача 2.8.1");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int leftIndex = 0;
        int rightIndex = arr.length-1;
        while (leftIndex < rightIndex) {
            int sum2 = arr[leftIndex] + arr[rightIndex];
            if (sum2 == numberToFind1) {
                System.out.println("Found " + arr[leftIndex] + " " + arr[rightIndex]);
                break;
            } else if (sum2 > numberToFind1) {
                rightIndex--;
            } else {
                leftIndex++;
            }
        }

        System.out.println();

        System.out.println("задача 2.9");
        int[] array = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        int numberToFind = -2;
        Arrays.sort(array);
        int first = 0;
        int last = array.length-1;
        while (first < last) {
            int sum1 = array[first] + array[last];
            if (sum1 == numberToFind) {
                System.out.println("Found " + array[first++] + " and " + array[last--]);
            } else if (sum1 > numberToFind) {
                last--;
            }  else {
                first++;
            }
        }









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
