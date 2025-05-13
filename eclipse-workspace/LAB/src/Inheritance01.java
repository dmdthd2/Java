
public class Inheritance01 extends Calculation {
public void gob(int x, int y) {
	z= x*y;
	System.out.println("두수의 곱셈: "+z);
}
	public static void main(String[] args) {
		int a= 10, b=20;
		Inheritance01 dmd = new Inheritance01();
		dmd.add(a, b);
		dmd.sub(a, b);
		dmd.gob(a, b);

	}

}
