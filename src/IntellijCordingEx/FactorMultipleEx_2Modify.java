package IntellijCordingEx;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class FactorMultipleEx_2Modify {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);

        int count = 0;
        int number = 0;

        for (int i = 1; i <= N; i++) {
            if(N % i == 0){
                count++;
                if(count == K){
                    number = i;
                    break;
                }
            }
        }
        if(K == count){
            bw.write(String.valueOf(number));
        }else{
            bw.write(String.valueOf(0));
        }
        bw.flush();
    }
}
