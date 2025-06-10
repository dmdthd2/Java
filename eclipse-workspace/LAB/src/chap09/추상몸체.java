package chap09;

public class 추상몸체 {

	public static void main(String[] args) {
		추상모양 s1= new 추상원("빨간색",2.2);
		추상모양 s2 = new 추상사각("파란색",2,4);
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());

	}

}
