package IntellijCordingEx;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class FactorMultipleEx_1 {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {

            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            if(a == 0 && b == 0){
                break;
            }
                if (b % a == 0) {
                    bw.write("factor");
                }
               else if (a % b == 0) {
                    bw.write("multiple");
                }
                else if ( a == b) {
                    bw.write("factor");
                }
                else {
                    bw.write("neither");
                } bw.newLine();

        } bw.flush();

    }
}
