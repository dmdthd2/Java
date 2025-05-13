
public class mme {
	public static void a() {
		System.out.println("스태틱이라 정적");
		
	}
	public void b() {
		System.out.println("인스턴스라 객채를 만들어줘!!!");
	}

	public static void main(String[] args) {

		a();
		mme ob = new mme();

		ob.b();
	}

}
