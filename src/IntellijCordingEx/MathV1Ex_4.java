package IntellijCordingEx;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MathV1Ex_4 {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());
        int layer = 1;
        int layerCount = 1;
        int num = 0;
        int den = 0;

        for (int i = 0; input > layerCount+i; i++) {
            layer++;
            layerCount += (i+1);
        }
        int a = input - layerCount;

        if (layer % 2 == 0) {
            num = a+1;
            den = layer - a ;
        }
        if (layer % 2 == 1) {
            den = a+1 ;
            num = layer - a ;

        }  bw.write(String.valueOf(num) + "/" + String.valueOf(den));
        bw.flush();
    }
}
