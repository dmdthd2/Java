import java.util.*;

public class Star02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//사각형 대각선 오른쪽에서 왼쪽으로 긋기
		Scanner sc = new Scanner(System.in);
		System.out.println("몇줄짜리 사각형을 만들까요?(3이상 추천)");
		int a = sc.nextInt();

		for (int i = 1; i <= a; i++) {
			if (i == 1 || i == a ) {
				for (int j = 1; j <= a; j++) {
					System.out.print("*");
				}
			} else {
				for (int k = 1; k <= a; k++) {
					if (k == 1 || k == a  || k +i== a+1 ) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
}
