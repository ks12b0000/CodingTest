package Chapter3.반복문;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);

	    int A = scan.nextInt();
	    
	    for(int i = 1; i < 10; i++) {
	    	System.out.println(A+" * "+i+" = "+(A*i));
	    }
	    
	    scan.close();
	}

}
