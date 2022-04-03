package Chapter4_1차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumCountBufferArr {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[10];
		int valaue = Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine());
		String A = Integer.toString(valaue);
		
		for(int i = 0; i < arr.length; i++) {
			int count = 0;
			for(int j = 0; j < A.length(); j++) {
				
				if((A.charAt(j)-'0') == i) {
					count++;
				}
			}System.out.println(count);
		}
	}

}
