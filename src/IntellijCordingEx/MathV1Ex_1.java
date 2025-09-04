package IntellijCordingEx;

import java.io.*;


public class MathV1Ex_1 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());

        for (int i = 0; i < input; i++) {
            int quarterDiv = 0 ;
            int dimeDiv = 0 ;
            int nickelDiv = 0 ;
            int pennyDiv = 0 ;
            int change = Integer.parseInt(br.readLine());
            if(change >= 25){
                quarterDiv = change / 25 ;
                change = change % 25;
            }if(change >= 10) {
                dimeDiv = change / 10;
                change = change % 10;
            }if(change >= 5) {
                nickelDiv = change / 5;
                change = change % 5;
            }if(change >= 1) {
                pennyDiv = change;
            }
            bw.write(quarterDiv+" "+dimeDiv+" "+nickelDiv+" "+pennyDiv);
            bw.newLine();
        } bw.flush();
    }
}
