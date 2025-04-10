package test;

public class st08 {
	public static void meth(int a, int b) {//void는 밑에 필요없음 (syso말하는 거임)
		System.out.println(a+b);
		
	}
public static double meth(double a, int b) {
	return a+b;
		
	}
public static double meth(int a, double b) {
	return a*b;
	
}
public static boolean meth(double x, double y) {
	double result;
	if(x>y) {
		result =x;
		}else {
			result=y;
		}
	if(result==x) 
		return true;
	else{
		return false;
	}
	
	
}

	public static void main(String[] args) {
		
		meth(2,3);
		System.out.println(meth(2.5,3));
		System.out.println(meth(2,3.5));
		System.out.println(meth(2.0,3.0));
		

	}

}
