package Practice;

public class st {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String st1 = new String("hello");
		String st2 = new String("hello");
		
		String st3 = "hello";
		String st4 = "hello";
		
		if (st1 == st2)
			System.out.println("같아");
		else 
			System.out.println("달라 병신아 ㅋㅋ");
		
		if(st3==st4)
			System.out.println("같은 래퍼런스");
		
		if(st1 != st3)
			System.out.println("다름 ㅋㅋ");
		
		
		System.out.println(st1.substring(2));
	}

}
