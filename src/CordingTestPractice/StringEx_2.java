package CordingTestPractice;

import java.util.Scanner;

public class StringEx_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] chars = input.toCharArray();

        for(int i = 0 ; i < chars.length; i++){
            char a = chars[i];
            if(Character.isUpperCase(chars[i])){
                chars[i] = Character.toLowerCase(chars[i]);
            }else if(Character.isLowerCase(chars[i])){
                chars[i] = Character.toUpperCase(chars[i]);
            }System.out.print(chars[i]);
        }
    }
}

