package ru.skypro;

import com.sun.security.jgss.GSSUtil;

public class Main {

    public static void main(String[] args) {





        ////    private static void task5() {
        ////         Массивы 2
        ////
        //////Задание 1
        ////        System.out.println("Задание 1");
        ////
        ////        int[] payments = generateRandomArray();
        ////        int sum = 0;
        ////        for (int i = 0; i < payments.length; i++) {
        ////            sum = sum + payments[i];
        ////        }
        ////        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        ////
        ////        System.out.println();
        ////        //Задание 2
        ////        System.out.println("Задание 2");
        ////
        ////        int[] expenses = generateRandomArray();
        ////        int min = expenses[0];
        ////        int max = expenses[0];
        ////        for (int i = 0; i < expenses.length; i++) {
        ////            if(expenses[i] < min ) {
        ////                min = expenses[i];
        ////            }
        ////            if (expenses[i] > max) {
        ////                max = expenses[i];
        ////            }
        ////        }
        ////        System.out.println("Минимальная сумма трат за день составила " + min + " рублей");
        ////        System.out.println("Максимальная сумма трат за день составила " + max + " рублей");
        ////
        ////        System.out.println();
        ////        //Задание 3
        ////        System.out.println("Задание 3");
        ////
        ////        int [] monthSum = generateRandomArray();
        ////        float sum1 = 0;
        ////        for (int i = 0; i < monthSum.length; i++) {
        ////            sum += monthSum[i];
        ////        }
        ////        float average = sum / (float)monthSum.length;
        ////        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");
        ////
        ////        System.out.println();
        ////        //Задание 4
        ////        System.out.println("Задание 4");
        ////
        ////        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        ////        for (int i = reverseFullName.length-1; i >= 0; i--) {
        ////            System.out.print(reverseFullName[i]);
        ////        }
        ////        System.out.println();
        ////        System.out.println();
        ////        //Задание 5
        ////        System.out.println("Задание 5");
        ////
        ////        int [][] array2D = new int [5][10];
        ////        for (int i = 0; i < array2D.length; i++) {
        ////            for (int j = 0; j < array2D[i].length; j++) {
        ////                array2D[i][j] = 1;
        ////            }
        ////        }
        ////        for (int i = 0; i < array2D.length; i++) {
        ////            for (int j = 0; j < array2D[i].length; j++) {
        ////                System.out.print(array2D[i][j] + " ");
        ////            }
        ////            System.out.println();
        ////        }
        ////        System.out.println("Задание 5.1");
        ////        int [][] matrix = new int [5][10];
        ////        for (int i = 0; i < matrix.length; i++) {
        ////            for (int j = 0; j < matrix[i].length; j++) {
        ////                matrix[i][j] = 1;
        ////                matrix[i][matrix.length - 1 - i] = 1;
        ////            }
        ////        }
        ////        for (int[] row : matrix) {
        ////            for (int column : row) {
        ////                System.out.print(column + " ");
        ////            }
        ////            System.out.println();
        ////        }
        ////
        ////        //Задание 6
        ////        int [] array = {5, 4, 3, 2, 1};
        ////        for (int i = 0; i < array.length; i++) {
        ////            for (int j = 0; j < array.length; j++) {
        ////
        ////        }
        //      //  array[i] = array[j].length ;
        ////        }
        ////
        ////        Необходимо привести его к виду: {1, 2, 3, 4, 5}
        ////        Решите задачу с использованием дополнительного массива.
        ////        Напечатайте массив до преобразования и после с помощью
        ////        System.out.println(Arrays.toString(arr));
        ////        Критерии оценки:
        ////
        ////        :death_star: Задание 7
        ////        Решите предыдущее задание, но без использования дополнительного массива.
        ////        Необходимо добиться того, чтобы исходный массив полностью соответствовал
        ////         второму массиву из прошлого задания.
        ////        Выведите результат программы в консоль тем же способом.
        ////        Уточнения:
        ////        Это задание не на сортировку.
        ////        Не использовать Arrays.sort() и другие способы сортировок.
        ////        Числа в порядке убывания даны исключительно для указания направления чтения.
        ////        Массив может быть 5 8 2 3 9, нужно из него сделать 9 3 2 8 5.
        ////        Критерии оценки:
        ////        – Задание решено без применения дополнительного массива.
        ////        – В консоль выведен результат программы до преобразований массива.
        ////        – В консоль выведен результат программы после преобразований массива.
        ////        – Программа выводит корректный результат при смене значений внутри массива.
        ////        Задание 8  Очень сложно.
        ////        int[] arr = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        ////        for (int i = 0; i < arr.length-1; i++) {
        ////            Arrays.sort(arr);
        ////       if (arr[i] + arr[i] == -2) {
        ////           System.out.println("sum " + arr[i] + " and " + arr[i] + " = -2");
        ////            }
        ////        }
        ////
        ////       Задание 9  Очень сложно.
        ////        int[] arr = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        ////        for (int i = 0; i < arr.length; i++) { //length -1
        ////            for (int j = 0; j < arr.length; j++) {//j=i+1
        ////                if( arr[i] + arr[j] == -2) {
        ////                    System.out.println("sum " + arr[i] + " and " + arr[j] + " = -2");
        ////                }
        ////            }
        ////    }
        ////
        ////    private static void task4() {
        ////        // Массивы 1
        ////        // задача 1
        ////        System.out.println("задача 1");
        ////
        ////        int[] first = new int[] {1, 2, 3};
        ////        System.out.println("1. " + Arrays.toString(first));
        ////
        ////        double[] second = {1.57, 7.654, 9.986};
        ////        System.out.println("2. " + Arrays.toString(second));
        ////
        ////        int[] third = new int[5];
        ////        third[0] = 5;
        ////        third[1] = 10;
        ////        third[2] = 15;
        ////        System.out.print("3. " + third[0] + " ");
        ////        System.out.print(third[1] + " ");
        ////        System.out.print(third[2] + " ");
        ////
        ////        System.out.println();
        ////
        ////        int[] fourth = new int[]{5, 2, 3, 1, 6, 4, 7};
        ////        System.out.println("4. " + Arrays.toString(fourth));
        ////
        ////        System.out.println();
        ////
        ////        // задача 2
        ////        System.out.println("задача 2");
        ////
        ////        int[] array1 = new int[] {1, 2, 3};
        ////        for (int aaa = 0; aaa < array1.length; aaa++) {
        ////            if (aaa == array1.length-1) {
        ////                System.out.print(array1[aaa]);
        ////            }  else if (aaa < array1.length) {
        ////                System.out.print(array1[aaa] + " , ");
        ////            }
        ////        }
        ////        System.out.println();
        ////
        ////        double[] array2 = {1.57, 7.654, 9.986};
        ////        for (int bbb = 0; bbb < array2.length; bbb++) {
        ////            if(bbb == array2.length -1) {
        ////                System.out.print(array2[bbb]);
        ////            } else {
        ////                System.out.print(array2[bbb] + " , ");
        ////            }
        ////        }
        ////        System.out.println();
        ////        int[] array3 = new int[5];
        ////        array3[0] = 5;
        ////        array3[1] = 10;
        ////        array3[2] = 15;
        ////        for (int cc = 0; cc < array3.length; cc++) {
        ////            if(cc == array3.length-1) {
        ////                System.out.print(array3[cc]);
        ////            } else {
        ////                System.out.print(array3[cc] + " , ");
        ////            }
        ////        }
        ////        System.out.println();
        ////        int[] array4 = new int[]{5, 2, 3, 1, 6, 4, 7};
        ////        for (int dd = 0; dd < array4.length; dd++) {
        ////            if(dd == array4.length-1) {
        ////                System.out.print(array4[dd]);
        ////            } else if (dd < array4.length) {
        ////                System.out.print(array4[dd] + " , ");
        ////            }
        ////        }
        ////        System.out.println();
        ////        System.out.println();
        ////
        ////        // 3 задача
        ////        System.out.println("задача 3");
        ////
        ////        int[] arrayRet1 = new int[] {1, 2, 3};
        ////        for (int ee = arrayRet1.length - 1; ee >= 0; ee--) {
        ////            if (ee == 0) {
        ////                System.out.print(arrayRet1[ee]);
        ////            }  else if (ee < arrayRet1.length) {
        ////                System.out.print(arrayRet1[ee] + " , ");
        ////            }
        ////        }
        ////        System.out.println();
        ////
        ////        double[] arrayRet2 = {1.57, 7.654, 9.986};
        ////        for (int  f = arrayRet2.length-1; f >= 0; f--) {
        ////            if(f == 0) {
        ////                System.out.print(arrayRet2[f]);
        ////            } else {
        ////                System.out.print(arrayRet2[f] + " , ");
        ////            }
        ////        }
        ////        System.out.println();
        ////        int[] arrayRet3 = new int[5];
        ////        arrayRet3[0] = 5;
        ////        arrayRet3[1] = 10;
        ////        arrayRet3[2] = 15;
        ////        for (int  g = arrayRet3.length - 1; g >= 0; g--) {
        ////            if(g == 0) {
        ////                System.out.print(arrayRet3[g]);
        ////            } else {
        ////                System.out.print(arrayRet3[g] + " , ");
        ////            }
        ////        }
        ////        System.out.println();
        ////        int[] arrayRet4 = new int[]{5, 2, 3, 1, 6, 4, 7};
        ////        for (int h = arrayRet4.length - 1; h >= 0;  h--) {
        ////            if(h == 0) {
        ////                System.out.print(arrayRet4[h]);
        ////            } else if (h < arrayRet4.length) {
        ////                System.out.print(arrayRet4[h] + " , ");
        ////            }
        ////        }
        ////        System.out.println();
        ////        System.out.println();
        ////
        ////        //4 задача
        ////        System.out.println("задача 4");
        ////
        ////        int[] array5 = new int[] {1, 2, 3};
        ////        for (int ii = 0; ii < array5.length; ii++) {
        ////            if(array5[ii] % 2 !=0) {
        ////                System.out.print(array5[ii] + 1 + " ");
        ////            } else {
        ////                System.out.print(array5[ii] + " ");
        ////            }
        ////            if(ii == array5.length -1) {
        ////                System.out.print("");
        ////            } else {
        ////                System.out.print(", ");
        ////            }
        ////        }
        ////        System.out.println();
        ////        System.out.println("задача 4 version 2");
        ////
        ////
        ////    private static void task3() {
        ////        //1.4 ЦИКЛЫ
        ////
        ////        //Задание 1
        ////
        ////        int i = 1;
        ////        while(i <= 10) {
        ////            System.out.print(i++);
        ////        }
        ////
        ////        System.out.println();
        ////
        ////        for (int ii = 10; ii >=1; ii--) {
        ////            System.out.print(ii);
        ////        }
        ////        System.out.println();
        ////
        ////        //Задание 2
        ////
        ////        for (int weekday = 5; weekday <= 31; weekday+=7) {
        ////            System.out.println("Сегодня пятница, " + weekday + " е число." +
        ////                    "Необходимо подготовить отчет.");
        ////        }
        ////        System.out.println();
        ////
        ////        //Задание 3
        ////        int currentYear = 2021;
        ////        int last200Years = currentYear - 200;
        ////        int next100Years = currentYear + 100;
        ////        for (int cometYear = last200Years; cometYear <= next100Years; cometYear++) {
        ////            if(cometYear % 79 ==0) {
        ////                System.out.println(cometYear);
        ////            }
        ////        }
        ////        System.out.println();
        ////
        ////        //Задание 4
        ////
        ////        for(int day = 1; day <= 30; day++) {
        ////            if (day % 3==0 && day % 5==0) {
        ////                System.out.println(day + ":" + " ping pong");
        ////            } else if(day % 3==0) {
        ////                System.out.println(day + ":" + " ping");
        ////            } else if (day % 5==0) {
        ////                System.out.println(day + ":" + " pong");
        ////            }  else {
        ////                System.out.println(day + ":");
        ////            }
        ////        }
        ////        System.out.println();
        ////
        ////        //Задание 5
        ////        int even = 0;
        ////        int odd = 1;
        ////        for(int next = 0; next <5; next++) {
        ////            System.out.print(even + " " + odd + " ");
        ////            even = even + odd;
        ////            odd = odd + even;
        ////        }



        //
        //    public static int[] generateRandomArray() {
        //        java.util.Random random = new java.util.Random();
        //        int[] arr = new int[30];
        //        for (int i = 0; i < arr.length; i++) {
        //            arr[i] = random.nextInt(100_000) + 100_000;
        //        }
        //        return arr;
        //    }
        //}
    }
}
