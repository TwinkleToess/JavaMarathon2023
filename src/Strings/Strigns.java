package Strings;

import java.util.Arrays;

public class Strigns {
    public static void main(String[] args) {
        String str1 = new String("Hot, JavaHello");
        String str2 = "Java";
        System.out.println(str1.charAt(1));
        System.out.println(str1.codePointAt(1));
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareToIgnoreCase(str2));
        System.out.println(str1.concat(str2));
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.hashCode());
        System.out.println(str1.indexOf(65));
        System.out.println(str1.isEmpty());
        System.out.println(str1.length());
        String[] strings = str1.split(", ");
        System.out.println(Arrays.toString(strings));
        for (String element : strings) {
            System.out.println(element);
        }
        System.out.println(str1.substring(2, 8)); //Вырезает кусок между заданными индексами
        char[] charArray = str1.toCharArray();
        System.out.println(Arrays.toString(charArray));
        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());
        System.out.println(str1.trim());  //Обрезает пробелы в начале и в конце строки

        System.out.println(String.valueOf(65));  //Преобразует int в string



    }
}
