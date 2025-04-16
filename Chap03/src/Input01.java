import java.util.*;

public class Input01 {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 =new Scanner(System.in);
		System.out.println("정숫값 입력하기");
		int a = sc1.nextInt();
		
		System.out.println("실숫값 입력하기");
		double b =sc1.nextDouble();
		
		System.out.println("하고 싶은 말 입력하기");
		
		
		String c =sc2.nextLine();
		
		System.out.println("입력한 말: " +c);
		System.out.println("정숫값: "+a);
		System.out.println("실숫값: "+b);
		

	}

}
