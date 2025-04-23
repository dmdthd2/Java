import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		boolean bo = true;
		while (bo){

		Scanner sc = new Scanner(System.in);
		System.out.println("두 실수를 입력하세요");
		double a= sc.nextDouble();
		double b= sc.nextDouble();
		
		System.out.printf("%.1f + %.1f = %.1f\n", a, b, (a + b));
		System.out.printf("%.1f - %.1f = %.1f\n", a, b, (a - b));
		System.out.printf("%.1f * %.1f = %.1f\n", a, b, (a * b));
		System.out.printf("%.1f / %.1f = %.1f\n", a, b, (a / b));
		
		System.out.println("계속하려면 아무 키나 누르세요! (종료하려면 q)");
		Scanner sc2 = new Scanner(System.in);
		String c =sc2.nextLine();
		
		if(c.equals("q")) {
			System.out.println("종료합니다.");
			bo=false;
			
		}
		}
		
		
		

	}

}
