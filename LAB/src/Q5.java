import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean bo = true;
		
		int hap = 0;
		while (bo) {
			System.out.println("정수를 입력하세요");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int bg=a;
			int sm=b;
			if(a>b) {
				bg=a;
				sm=b;}
			else if(b>a) {
				bg=b;
				sm=a;
			}
			for (int i = sm; i <= bg; i++) {
				hap += i;
				}

			System.out.printf("%d부터 %d까지의 합 :%d", sm,bg, hap);
			hap=0;
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
