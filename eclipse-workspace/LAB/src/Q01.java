import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 수를 입력해");
		double a = sc.nextDouble();
		double b= sc.nextDouble();
		System.out.printf("%.1f + %.1f = %.1f",a,b,(a+b));
		
	}

}
