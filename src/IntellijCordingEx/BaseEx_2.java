package IntellijCordingEx;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class BaseEx_2 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        Map<Integer,String> map = new HashMap<>();
        map.put(10,"A");
        map.put(11,"B");
        map.put(12,"C");
        map.put(13,"D");
        map.put(14,"E");
        map.put(15,"F");
        map.put(16,"G");
        map.put(17,"H");
        map.put(18,"I");
        map.put(19,"J");
        map.put(20,"K");
        map.put(21,"L");
        map.put(22,"M");
        map.put(23,"N");
        map.put(24,"O");
        map.put(25,"P");
        map.put(26,"Q");
        map.put(27,"R");
        map.put(28,"S");
        map.put(29,"T");
        map.put(30,"U");
        map.put(31,"V");
        map.put(32,"W");
        map.put(33,"X");
        map.put(34,"Y");
        map.put(35,"Z");

        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int mod = 0;

        while(!(n == 0) ){
            mod = n % b ;
            n = n / b ;

            if(mod < 10){
                sb.append(mod);
            } else {
                sb.append(map.get(mod));
            }
        }
        for (int i = sb.length()-1; i >= 0 ; i--) {
            bw.write(sb.charAt(i));
        } bw.flush();
    }
}
