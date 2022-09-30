package Chapter1.입출력과사칙연산;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek3003 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
//		int Q = 1, W = 1;
//		int R = 2, T = 2, Y = 2;
//		int U = 8;
//
//		int A = Integer.parseInt(st.nextToken());
//		int B = Integer.parseInt(st.nextToken());
//		int C = Integer.parseInt(st.nextToken());
//		int D = Integer.parseInt(st.nextToken());
//		int E = Integer.parseInt(st.nextToken());
//		int F = Integer.parseInt(st.nextToken());
//		
//		System.out.printf("%d %d %d %d %d %d", Q-A, W-B, R-C, T-D, Y-E, U-F);
		
		int[] A = new int[6];
		int[] B = new int[]{1,1,2,2,2,8};
		
		for(int i = 0; i < 6; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0; i < B.length; i++) {
			A[i] = B[i] - A[i];
			System.out.println(A[i]);
		}
		
		br.close();
	}
}
