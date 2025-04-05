package Practice;

public class trowsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 1;
		
		try {
			int c = 시발(a, b);
			
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println("0은 안된다고 시발아ㅜ " + e.toString());
		}

	}

	 static int 시발(int a, int b) throws ArithmeticException {
		if(b==0) {
		 throw new IllegalArgumentException("평생 0이나 나눠봐라 시발아");
		}
		int c=  a / b;
		return c;
	}

}
