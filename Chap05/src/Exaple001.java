import java.util.*;

public class Exaple001 {
	public static void Method(int num) {
		if (num % 2 == 0)
			System.out.println("짝수입니다");
		else
			System.out.println("홀수입니다");
	}

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);

		num = sc.nextInt();
		Method(num);
		num = sc.nextInt();
		Method(num);
		num = sc.nextInt();
		Method(num);
	}

}
