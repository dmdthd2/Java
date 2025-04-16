
public class Example06 {
	public static void 서큘레이트(int a, int b) {
		System.out.println(a*b);
	}
public static void 서큘레이트(int a) {
	System.out.println(a*a);
	}
public static void 서큘레이트(int a, double b) {
	System.out.println(a*b);
}
public static void 서큘레이트(double a) {
	System.out.println(a*a);
}public static void 서큘레이트(double a, int b) {
	System.out.println(a*b);
}public static void 서큘레이트(long a, long b) {
	System.out.println(a*b);
}
	public static void main(String[] args) {
		서큘레이트(2,3);
		서큘레이트(2,3.14);
		서큘레이트(2);
		서큘레이트(2.5);
		서큘레이트(2.1,2);
		서큘레이트(1561321,516651);

	}

}
