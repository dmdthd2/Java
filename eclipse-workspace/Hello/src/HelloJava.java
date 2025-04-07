import java.util.*;

public class HelloJava {
	public static void main(String[] args) {
		Random rn = new Random();
		Scanner sc = new Scanner(System.in);
		
		boolean coin = true;
		while (coin) {
			System.out.println("동전을 던질 건데 할려면 아무 숫자나 누르시고 안 던질려면 3을 누르세요");
			int b = sc.nextInt();
			if (b == 3) {
				System.out.println("여기서 스탑하겠습니다.");
				coin= false;
			} else if (b != 3) {
				int a = rn.nextInt(100) + 1;
				System.out.println("70프로의 확률로 나의 이름이 출력됩니다");
				if (a < 70) {
					System.out.println("김은송");
					
				} else if (a > 70) {
					System.out.println("30프로의 기적,,");
					
				}
				System.out.println();
			}

		}
	}
}
