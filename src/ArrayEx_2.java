
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ArrayEx_2 {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int [][] arr = new int [100][100];
       int count = 0;

        int paperCount = Integer.parseInt(br.readLine());
        for (int i = 0; i < paperCount; i++) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    arr[a+j][b+k] = 1;
                }
            }
        }
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if(arr[i][j] == 1){
                    count++;
                }
            }
        } bw.write(String.valueOf(count));
        bw.flush();
    }
}
