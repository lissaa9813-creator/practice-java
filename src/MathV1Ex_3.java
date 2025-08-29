import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MathV1Ex_3 {
    public static void main(String[] args) throws Exception{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());
        int layer = 1;
        int max = 1;

        while (input > max){
            max += ( 6 * layer );
            layer ++;
        }
        bw.write(String.valueOf(layer));
        bw.flush();
    }
}
