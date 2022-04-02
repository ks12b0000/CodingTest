package Chapter2.조건문;

import java.util.Scanner;

public class Dice {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);

	    int A = scan.nextInt();
	    int B = scan.nextInt();
	    int C = scan.nextInt();
	    
	    int result = 0;
	    
	    if(A==B && A==C && B==C) {
	    	result = 10000+A*1000;
	    }else if(A==B||A==C) {
	    	result = 1000 + A*100;
	    }else if(B==C) {
	    	result = 1000+B*100;
	    	}else {
	    		result = Math.max(A, Math.max(B, C))*100;
	    }System.out.println(result);
	    
	    scan.close();
	}

}
