package Chapter6.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfNumberBrArr {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[Integer.parseInt(br.readLine())];
		String B = br.readLine();
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			sum += B.charAt(i)-'0';
		}System.out.println(sum);
		
		
		br.close();

	}

}
