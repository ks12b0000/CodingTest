package Chapter6.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CroatiaApbBr {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String A = br.readLine();
		int count = 0;
		
		for(int i = 0; i < A.length(); i++) {
			char ch = A.charAt(i);
			
			if(ch == 'c' && i < A.length() -1) {
				if(A.charAt(i + 1) == '=' || A.charAt(i + 1) == '-') {
					i++;
				}
			}
			else if(ch == 'd' && i < A.length() -1) {
				if(A.charAt(i + 1) == 'z' && i < A.length() -2) {
					if(A.charAt(i + 2) == '=') {
						i += 2;
					}
				}
				else if(A.charAt(i + 1) == '-') {
					i++;
				}
			}
			else if(ch == 'l' && i < A.length() -1) {
				if(A.charAt(i + 1) == 'j') {
					i++;
				}
			}
			else if(ch == 'n' && i < A.length() -1) {
				if(A.charAt(i + 1) == 'j') {
					i++;
				}
			}
			else if(ch == 's' && i < A.length() -1) {
				if(A.charAt(i + 1) == '=') {
					i++;
				}
			}
			else if(ch == 'z' && i < A.length() -1) {
				if(A.charAt(i + 1) == '=') {
					i++;
				}
			}
			count++;
		}
		System.out.println(count);
		
		
		br.close();

	}

}
