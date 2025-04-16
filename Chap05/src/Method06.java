
public class Method06 {
public static int sum(int a, int b) {
	return(a+b);
}
public static int sum(int a, int b,int c) {
	return(a+b+c);
}
public static double sum(double a, double b) {
	return(a + b);
}

	public static void main(String[] args) {
		System.out.println("sum(10,20)의 값: "+sum(10,20));
		System.out.println("sum(10,20,30)의 값: "+sum(10,20,30));
		System.out.println("sum(10.5,20.5)의 값: "+sum(10.5,20.5));

	}

}
