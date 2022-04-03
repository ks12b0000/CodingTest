package Chapter4_1차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OXQuizBufferArr {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] arr = new String[Integer.parseInt(br.readLine())];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = br.readLine();			
		}
		for(int i = 0; i < arr.length; i++ ) {
			int sum = 0;
			int cnt = 0;
			for(int j = 0; j < arr[i].length(); j++) {
				if(arr[i].charAt(j) == 'O') {
					cnt++;
				}else {
					cnt = 0;
				}
				sum += cnt;
			}
			System.out.println(sum);
		}
		
		
		br.close();
	

}
}
