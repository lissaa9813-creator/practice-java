package CordingTestPractice;

import java.util.Scanner;

public class StringEx_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine().toUpperCase();
        String input2 = scanner.nextLine().toUpperCase();
        int count = 0;
        char[] chars = input1.toCharArray();
        char a = input2.charAt(0);

        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == a){
                count++;
            }

        }
        System.out.println(count);


    }
}
