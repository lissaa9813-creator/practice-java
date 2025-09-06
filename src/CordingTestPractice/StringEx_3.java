package CordingTestPractice;

import java.util.Scanner;

public class StringEx_3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");

        String max = words[0];

        for(int i = 1; i < words.length; i++){

            if(words[i].length() > max.length()){
                max = words[i];
            }
            else if(words[i].length() < max.length()){
                continue;
            }
        } System.out.println(max);

    }
}
