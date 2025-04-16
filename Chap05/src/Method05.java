
public class Method05 {

	public static void 원둘레(int a, double b) {
		System.out.println(2*a*b);
		
	}
	public static void main(String[] args) {
		int x =4;
		double pi =3.14;
		
		System.out.println("원을 구하는 공식: 2 X 반지름 X 원주율");

		System.out.println("2 X "+ x +" X "+ pi);
		원둘레(x,pi);
	}

}
