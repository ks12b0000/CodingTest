package Chapter6.문자열;

import java.util.Scanner;

public class AlphabetIndexOf {

	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
	        
	        String word = scan.next();
	        for (char c = 'a' ; c <= 'z' ; c++)
	            System.out.print(word.indexOf(c) + " ");
	        //indexOf()는 특정 문자의 위치를 반환하며
	        //존재하지 않을경우 -1을 반환하는 메서드임.
	        scan.close();
	        

	}

}
