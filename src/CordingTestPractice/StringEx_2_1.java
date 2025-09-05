package CordingTestPractice;

import java.util.Scanner;

public class StringEx_2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        for(char chars : input.toCharArray()){
            if(Character.isUpperCase(chars)){
                chars = Character.toLowerCase(chars);
            }else {
                chars = Character.toUpperCase(chars);
            }System.out.print(chars);
        }
    }
}

