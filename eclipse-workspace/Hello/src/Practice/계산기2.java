package Practice;

public interface 계산기2 {
	public int 더하기(int a, int b) ;
	public int 곱하기(int a, int b);
	
	public default int 더하기2(int a, int b) {
		return a+b;
	}
	static int 곱하기2(int a, int b) {
		return a*b;
	}

}
