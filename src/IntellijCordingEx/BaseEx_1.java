package IntellijCordingEx;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class BaseEx_1 {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String,Integer> map = new HashMap<>();
        map.put("A",10);
        map.put("B",11);
        map.put("C",12);
        map.put("D",13);
        map.put("E",14);
        map.put("F",15);
        map.put("G",16);
        map.put("H",17);
        map.put("I",18);
        map.put("J",19);
        map.put("K",20);
        map.put("L",21);
        map.put("M",22);
        map.put("N",23);
        map.put("O",24);
        map.put("P",25);
        map.put("Q",26);
        map.put("R",27);
        map.put("S",28);
        map.put("T",29);
        map.put("U",30);
        map.put("V",31);
        map.put("W",32);
        map.put("X",33);
        map.put("Y",34);
        map.put("Z",35);


        int base = 0 ;
        int sum = 0 ;
        String[] input = br.readLine().split(" ");
        base = Integer.parseInt(input[1]);
        int[] result = new int[input[0].length()];
        for (int i = 0; i <input[0].length() ; i++) {
            char ch = input[0].charAt(i);
            if(Character.isDigit(ch)){
                result[i] = (ch - '0') * (int) Math.pow(base, input[0].length()-1-i);
            } else if (Character.isLetter(ch)) {
                int value = map.get(String.valueOf(ch));
                result[i] = value * (int) Math.pow(base, input[0].length()-1-i);
            }
        }
        for (int i = 0; i < result.length ; i++) {
            sum += result[i];
        }
        bw.write(String.valueOf(sum));
        bw.flush();
    }
}
