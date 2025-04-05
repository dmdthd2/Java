package Practice;

public interface 계산기 {
	public int 더하기(int a, int b);
	public int 곱하기(int a, int b);
	
	default int exex(int a, int b) {
		return a+b;
		
	}
	 static int exex2(int a, int b) {
		return a*b;
	}

}
