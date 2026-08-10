package com.isaachome.demo;

public class StringDemo {
    static void main() {
        // String is
        String str = "Hello World";
        String str2 = "Hello World";
       String resultString= str2.substring(3, 5);
        System.out.println("str2 : "  + str2);
        System.out.println("resultString : "  + resultString);

        System.out.println(str.equals(str2));
        System.out.println(str == str2);
        System.out.println(str.length());

        String str1 = new String("Hello");
            str1.concat(" from Java");
//        System.out.println(str2);
        System.out.println(str1);

        System.out.println(reverseString("Hello"));
    }

    private static String  reverseString(String input){
        if (input == null) {
            return null;
        }

        char[] chars = input.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        // Swap characters from outward in
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }

        return new String(chars);
    }
}


