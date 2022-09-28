import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String A = br.readLine();

		System.out.println(A + "??!");
		
		br.close();
	}
}
