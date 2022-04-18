package Chapter6.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

 
public class WordStudyBr {
	public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	int[] arr = new int[26];
	String A = br.readLine();
	
	for(int i = 0; i < A.length(); i++) {
		
		if('A' <= A.charAt(i) && A.charAt(i) <= 'Z') {
			arr[A.charAt(i) - 'A']++;
		}
		else {
			arr[A.charAt(i) -'a']++;
		}
	}
	int max = -1;
	char ch = '?';
	
	for(int i = 0; i < 26; i++) {
		if(arr[i] > max) {
			max = arr[i];
			ch = (char)(i+65);
		}
		else if(arr[i] == max) {
			ch = '?';
		}
	}
	System.out.println(ch);
	

	br.close();

	}
}
