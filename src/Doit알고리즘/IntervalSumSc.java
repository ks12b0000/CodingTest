package Doit알고리즘;

import java.util.Scanner;

public class IntervalSumSc {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();		//5입력
		int B = scan.nextInt();		//3입력	
		
		
		int[] S = new int[A+1];		//A에 1을 더해준 배열을 만듦
									//문제에선 첫번째자리수를 0으로 읽는게 아니라 1부터 시작이라
		
		for(int i = 1; i <= A; i++) {	//A만큼 반복해서 i까지의 누적합을 구함
			
			S[i] = S[i-1] + scan.nextInt();
		}
		for(int i = 0; i < B; i++) {
			int C = scan.nextInt();
			int J = scan.nextInt();
			//C,J사이의 구간 합은 S[j] - S[C-1]과 같음
			System.out.println(S[J] - S[C-1]);
		}
		
		scan.close();
	}

}
