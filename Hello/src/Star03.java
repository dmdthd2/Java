import java.util.*;

public class Star03 {

	public static void main(String[] args) {
		// 몇 줄을 출력할지 정하고 랜덤한 별의 갯수 출력하기(중복허용)
		Scanner sc = new Scanner(System.in);

		System.out.println("몇줄 출력할까요");
		int a = sc.nextInt();

		Random rn = new Random();

		for (int i = 1; i <= a; i++) {
			int b = rn.nextInt(a) + 1;
			System.out.print(b + ":");
			for (int j = 1; j <= b; j++) {
				System.out.print("*");

			}
			System.out.println();
		}
	}

}
