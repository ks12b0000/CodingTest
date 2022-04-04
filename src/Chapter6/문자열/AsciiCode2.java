package Chapter6.문자열;

import java.io.IOException;

public class AsciiCode2 {

	public static void main(String[] args)throws IOException {
		
		int a = System.in.read();
		System.out.println(a);
	
		// 애초에 System.in은 byte값으로 문자
		// 한개만 읽으면서 해당 문자에 대응되는 아스키코드 값을
		// 저장할 수 있다. 반드시 예외처리 해줘야 됨.
		//IOException해도되고 그냥 Exception해도됨.
	}

}
