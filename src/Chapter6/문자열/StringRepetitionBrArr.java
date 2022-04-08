package Chapter6.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class StringRepetitionBrArr {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int A = Integer.parseInt(br.readLine());
		int[] arr = new int[A];
		
		for(int i = 0; i < A; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			arr[i] = Integer.parseInt(st.nextToken());
			String B = st.nextToken();
			for(int j = 0; j < B.length(); j++) {
				for(int d = 0; d < arr[i]; d++) {
					System.out.print(B.charAt(j));
				}
			}System.out.println();
		}
		
		
		
		
		br.close();
		
		
		
}
	

}