package Chapter4_1차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class RemainBufferArr {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<Integer> h = new HashSet<Integer>();
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			h.add(Integer.parseInt(br.readLine())%42);
			
		}System.out.println(h.size());
		
		br.close();
		
		
		
		

}
}