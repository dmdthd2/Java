import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		boolean bo =true;
		int hap=0;
		
		Scanner sc = new Scanner(System.in);
		
		while(bo) {
		System.out.println("정수를 입력하라");
		int a = sc.nextInt();
		
		for(int i =1; i<=a; i++) {
			hap+=i;
		}System.out.println(hap);
		hap=0;
		sc.nextLine();
		System.out.println("계속하려면 아무키나 누르세요");
		String s =sc.nextLine();
		

		}
	}

}
