import java.util.Scanner;

public class Star05 {
	public static void main(String[] args) {
		
		boolean help_Me = true;

		System.out.println();

		while (help_Me) {
			Scanner sc = new Scanner(System.in);
			System.out.println("몇 줄짜리 별를 만들까요?(5이상 홀수만 가능 짝수나 4이하 입력 금지)");
			int a = sc.nextInt();
			int ms = (a + 1) / 2;
			if (a < 5||a%2==0) {
				System.err.println("안된다고.\n프로그램 종료");
				help_Me = false;
			} else {
				for (int i = 1; i <= a; i++) {
					for (int j = 1; j <= a; j++) {
						if (i == ms) {
							System.out.print("*");
						} else if (j == ms) {
							if (i > ms) {
								System.out.print(" ");
							} else {
								System.out.print("*");
							}
						} else if (i > ms) {
							if (j + i == a +1 || j == i) {
								System.out.print("*");
							} else {
								System.out.print(" ");
							}
						} else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}
			}
		}
	}
}