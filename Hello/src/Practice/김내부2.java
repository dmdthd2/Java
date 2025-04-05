package Practice;

public class 김내부2 {

	static class 내부2{
		int a=0;
		public void 안2 () {
			a++;
		}
		
	}
	public static void main(String[] args) {
		김내부2.내부2 n2= new 김내부2.내부2();
		n2.안2();
		System.out.println(n2.a);

	}

}
