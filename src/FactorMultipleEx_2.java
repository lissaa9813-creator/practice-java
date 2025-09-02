import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class FactorMultipleEx_2 {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);

        int count = 0;
        int number = 1;

        while(N >= number){
            if(N % number == 0){
                count++;
                if(K == count){
                    break;
                }
            } number++;
        } if(K == count){
            bw.write(String.valueOf(number));
        }else{
            bw.write(String.valueOf(0));
        }
        bw.flush();
    }
}
