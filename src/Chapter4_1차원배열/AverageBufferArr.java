package Chapter4_1차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AverageBufferArr {

	public static void main(String[] args)throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	int A = Integer.parseInt(br.readLine());
	StringTokenizer st;
	
	for(int i = 0; i < A; i++) {
		st = new StringTokenizer(br.readLine()," ");
		
		int B = Integer.parseInt(st.nextToken());
		int[] arr = new int[B];
		double sum = 0;
		
		for(int j = 0; j < B; j++) {
			int val = Integer.parseInt(st.nextToken());
			arr[j] = val;
			sum += val;
		}
		double mean = sum/B;
		double count = 0;
		
		for(int j = 0; j < B; j++) {
			if(arr[j] > mean) {
				count++;
			}
		}
		System.out.printf("%.3f%%\n",(count/B)*100);
	}
	
	
	br.close();
		
		
	}

}
