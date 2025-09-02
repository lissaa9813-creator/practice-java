import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class FactorMultipleEx_3 {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            int input = Integer.parseInt(br.readLine());
            int factor = 0 ;
            StringBuilder sb = new StringBuilder();
            if(input == -1){
                break;
            }
            for (int i = 1; i < input; i++) {
                if(input % i == 0){
                    sb.append(i).append(" + ");
                    factor += i;
                }
            }
            if(factor == input){

                sb.setLength(sb.length()-3);
                bw.write(input+" = "+sb);
                bw.newLine();
            }else {
                bw.write(input+" is NOT perfect.");
                bw.newLine();
            }
        } bw.flush();
    }
}
