import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ArrayEx_1 {
 public static void main(String[] args) throws Exception {
  BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  String[][] arr = new String[5][15];

  for (int i = 0; i < 5; i++) {
   String input = br.readLine();
   for (int j = 0; j < input.length(); j++) {
    arr[i][j] = String.valueOf(input.charAt(j));
   }
  }
  for (int i = 0; i < 15; i++) {
   for (int j = 0; j <arr.length ; j++) {
    if(arr[j][i] == null){
     continue;
    } bw.write(arr[j][i]);
   }
  } bw.flush();
 }
}

