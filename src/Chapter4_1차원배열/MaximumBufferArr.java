package Chapter4_1차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaximumBufferArr {
	public static void main(String[] args)throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	int[] arr = new int[9];
	int max = 0;
	int count = 0;
	
	for(int i = 0; i < arr.length; i++) {
		arr[i] = Integer.parseInt(br.readLine());
		
		if(arr[i] > max) {
			max = arr[i];
			count = i+1;
		}
	}System.out.println(max);
	System.out.println(count);
	
	
	br.close();

	

}

}
