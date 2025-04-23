import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean a =true;
		int hap=0;
		while(a) {
			for (int i =1; i<=100; i++) {
				if(i%2==0) {
					hap+=i;
					}
				}System.out.println("1부터 100까지 짝수 합:"+hap);
				hap=0;
				System.out.println("계속하려면 아무키나 누르세요(종료하려면 q)");
				Scanner sc = new Scanner(System.in);
				String s =sc.nextLine();
				if(s.equals("q")) {
					System.out.println("종료");
					a=false;
				}
				
			}
	}

}
