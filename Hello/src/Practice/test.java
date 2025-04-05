package Practice;

public class test {
	int g =10;
	static int sv = 7;
	
	public void test(int v) {
		int ls=20;
		
		System.out.println(g);
		System.out.println(ls);
		System.out.println(v);
	
}
	public void test2(int b) {
		System.out.println(g);
//		System.out.println(ls);
//		System.out.println(v);
		System.out.println(b);
		
	}
	public static  void main (String[] args) {
//		System.out.println(g);
//		System.out.println(ls);
//		System.out.println(v);
		System.out.println(sv);
		
		test v1 = new test();
		System.out.println(v1.g);
		test v2 = new test();
		v1.g=10;
		v2.g=20;
		System.out.println(v1.g);
		System.out.println(v2.g);
		v1.sv=50;
		v2.sv=100;
		System.out.println(v1.sv);
		System.out.println(v2.sv);
		System.out.println(test.sv);
	
	}
}
