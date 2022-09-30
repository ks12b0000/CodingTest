package Chapter2.조건문;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beak9498 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int A = Integer.parseInt(br.readLine());
		
		if (A > 89) {
			System.out.println("A");
		} else if (A > 79) {
			System.out.println("B");
		} else if (A > 69) {
			System.out.println("C");
		} else if (A > 59) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
		br.close();
	}
}
