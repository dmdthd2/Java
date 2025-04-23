import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean bo = true;
		int hap = 0;
		while (bo) {
			System.out.println("정수를 입력하세요");
			int a = sc.nextInt();
			for (int i = 1; i <= a; i++) {
				if (i % 2 != 0) {
					hap += i;
				}
			}

			System.out.printf("1부터 %d까지의 홀수합 :%d", a, hap);
			System.out.println("\n계속하려면 아무 키나 누르세요! (종료하려면 q)");
			Scanner sc2 = new Scanner(System.in);
			String c = sc2.nextLine();

			if (c.equals("q")) {
				System.out.println("종료합니다.");
				bo = false;
			}

		}

	}
}
