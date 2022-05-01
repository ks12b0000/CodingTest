package Chapter6.문자열;

import java.util.Scanner;

public class CroatiaApb {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String A = scan.next();
		int count = 0;
		
		for(int i = 0; i < A.length(); i++) {
			char ch = A.charAt(i);
			
			if(ch == 'c') {
				if(i < A.length() -1) {
					if(A.charAt(i + 1) == '=') {
						i++;
					}
					else if(A.charAt(i + 1) == '-') {
						i++;
					}
				}
			}
			else if(ch == 'd') {
				if(i < A.length() -1) {
					if(A.charAt(i + 1) == 'z') {
						if(i < A.length() -2) {
							if(A.charAt(i + 2) == '=') {
								i += 2;
						}
					}
				}
					else if(A.charAt(i + 1) == '-') {
						i++;
					}
				}
			}
			else if(ch == 'l') {
				if(i < A.length() -1) {
					if(A.charAt(i + 1) == 'j') {
						i++;
					}
				}
			}
			else if(ch == 'n') {
				if(i < A.length() -1) {
					if(A.charAt(i + 1) == 'j') {
						i++;
					}
				}
			}
			else if(ch == 's') {
				if(i < A.length() -1) {
					if(A.charAt(i + 1) == '=') {
						i++;
					}
				}
			}
			else if(ch == 'z') {
				if(i < A.length() -1) {
					if(A.charAt(i + 1) == '=') {
						i++;
					}
				}
			}
			count++;
		}
		System.out.println(count);
		
		
		
		scan.close();

	}

}
