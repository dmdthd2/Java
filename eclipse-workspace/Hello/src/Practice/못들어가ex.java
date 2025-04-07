package Practice;

public class 못들어가ex {

	public static void main(String[] args) {
		
		못들어가 m =new 못들어가();
		System.out.println(m.a);//public은 다 가능
		System.out.println(m.b);//protected는 같은 패키지 안에서 가능이고 다른 패키지이더라도 상속되면 가능
		System.out.println(m.c); //int는 같은 패키지 안에서 가능
//		System.out.println(m.d); 얘는 안댐 프라이빗이라서!

	}

}
