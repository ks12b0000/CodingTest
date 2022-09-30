package Chapter1.입출력과사칙연산;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baek2588 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int A = Integer.parseInt(br.readLine());
		String B = br.readLine();
		
		System.out.println(A * (B.charAt(2) - '0'));
		System.out.println(A * (B.charAt(1) - '0'));
		System.out.println(A * (B.charAt(0) - '0'));
		System.out.println(A * (Integer.parseInt(B)));
		
		br.close();
	}
}
