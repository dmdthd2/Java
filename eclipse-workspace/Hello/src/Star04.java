import java.util.*;

public class Star04 {

	public static void main(String[] args) {
		// 입력한 수의 2배 길이인 나비 출력하기

		boolean bt = true;
		while (bt) {
			Scanner sc = new Scanner(System.in);
			System.out.print("나비의 반을 몇줄로 출력할까요? (2이하는 돌연변이 나비) \n종료하려면 0을 누르세요");
			int a = sc.nextInt();
			if (a == 0) {
				System.out.println("프로그램 종료");
				bt = false;
			}

			else {
				if(a<=2) {
				System.err.println("돌연변이라 형체가 이상함");
				}
				
				for (int i = 1; i <= a; i++) {
					for (int j = 1; j <= i; j++)
						System.out.print("*");
					for (int k = 1; k <= 2 * (a - i); k++)
						System.out.print(" ");
					for (int h = 1; h <= i; h++)
						System.out.print("*");
					System.out.println();
				}

				for (int i = a; i >= 1; i--) {
					for (int j = 1; j <= i; j++)
						System.out.print("*");
					for (int k = 1; k <= 2 * (a - i); k++)
						System.out.print(" ");
					for (int h = 1; h <= i; h++)
						System.out.print("*");
					System.out.println();
				}
			}

		}

	}
}