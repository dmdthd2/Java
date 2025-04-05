import java.util.*;

public class Star01 {

	public static void main(String[] args) {
		// 직삼각형만들기

		Scanner sc = new Scanner(System.in);
		System.out.println("몇줄 직삼각형을 만들까요?");
		int a = sc.nextInt();

		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
