import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean bo = true;
		int hap = 0;
		while (bo) {
			System.out.println("정수를 입력하세요");
			int a = sc.nextInt();
			for (int i = 1; i <= a; i++) {
				hap += i;
				}

			System.out.printf("1부터 %d까지의 합 :%d", a, hap);
			System.out.println("\n계속하려면 아무 키나 누르세요! (종료하려면 q)");
			
			String c = sc.nextLine();

			if (c.equals("q")) {
				System.out.println("종료합니다.");
				bo = false;
			}

		}

	}
}
