package homework_6_String.String;

public class main {

    public static void main(String[] args) {

        System.out.println("Задание 1");
        String firstName = "Ivan";
        firstName = " " + firstName;
        String middleName = "Ivanovich";
        middleName = " " + middleName;
        String lastName = "Ivanov";
        String fullName = lastName + firstName + middleName;
        System.out.println("ФИО сотрудника — " + fullName);

        System.out.println("Задание 2");
        String firstNameUp = firstName.toUpperCase();
        String middleNameUp = middleName.toUpperCase();
        String lastNameUp = lastName.toUpperCase();
        String fullNameUp = lastNameUp + firstNameUp + middleNameUp;
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameUp);

        System.out.println("Задание 3");
        fullNameUp = fullNameUp.replace(" ", "; ");
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameUp);

        System.out.println("Задание 4.1");
        String fullNameNew = fullName.replace("Ivanov Ivan Ivanovich", "Иванов Семён Семёнович");
        fullNameNew = fullNameNew.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullNameNew);

        System.out.println("Задание 4.2");
        String fullNameNew1 = "Иванов Семён Семёнович";
        String[] letterChange = fullNameNew1.split(" ");
        System.out.print("Данные ФИО сотрудника — ");
        for (int i = 0; i < letterChange.length; i++) {
            if (letterChange[i].contains("a")) {
                letterChange[i] = letterChange[i].replace('ё', 'е');
            }
        }
        String result1 = String.join(" ", letterChange);
        System.out.println(result1);

        System.out.println("Задание 5");
        String fullName2 = "Ivanov Ivan Ivanovich";
        int index = fullName2.indexOf(" ");
        int lastIndex = fullName2.lastIndexOf(" ");
        String lastName2 = fullName2.substring(0,fullName2.indexOf(" "));
        String firstName2 = fullName2.substring(fullName2.indexOf(" ") + 1, fullName2.lastIndexOf(" "));
        String middleName2 = fullName2.substring(fullName2.lastIndexOf(" ") + 1);
        System.out.println("Last name " + lastName2);
        System.out.println("First name " + firstName2);
        System.out.println("Middle name " + middleName2);

        System.out.println("Задание 6.1");
        String fullName3 = "Ivanov Ivan Ivanovich";
        String[] words = fullName3.split(" ");
        for (int i = 0; i < words.length; i++) {
            char [] chars = words[i].toCharArray();
            if (Character.isLowerCase(chars[0])) {
                chars[0] = Character.toUpperCase(chars[0]);
                words[i] = new String(chars);
            }
        }
        System.out.println(String.join(" ", words));


        System.out.println("Задание 6.2");
        String fullName11 = "ivanov ivan ivanovich";
        String fullName111 = "";
        char[] s = fullName.toCharArray();
        for (int i = 0; i < s.length; i++) {
            if (i == 0 || s[i - 1] == ' ') {
                s[i] = Character.toUpperCase(s[i]);
            }
        }
        for (int i = 0; i < s.length; i++) {
            fullName11 = fullName11 + s[i];
        }
        System.out.println("Верное написание Ф. И. О. сотрудника с заглавных букв  " + fullName11);


        System.out.println("Задание 7");
        String s1 = "135";
        String s2 = "246";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            sb.append(s1.charAt(i));
            sb.append(s2.charAt(i));
        }
        String result = sb.toString();
        System.out.println(sb);



        System.out.println("Задание 8");
        StringBuilder sb1 = new StringBuilder();
        String message = "aabccddefgghiijjkk";
        char duplicate = ' ';
        char[] letters = message.toCharArray();
        for (int i = 0; i < letters.length-1; i++) {
            if(letters[i] == letters[i + 1] && duplicate != letters[i]) {
                sb.append(letters[i]);
                duplicate = letters[i + 1];
            }
            System.out.println(sb.toString());
        }



    }
}
