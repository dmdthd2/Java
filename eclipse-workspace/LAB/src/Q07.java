import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		do {
			System.out.println("+++메뉴+++\n1.사각형 \n2.원 \n3.삼각형 \n4.종료");
			a=sc.nextInt();
			switch(a) {
			case 1:
				System.out.println("1");
				break;
			case 2:
				System.out.println("2");
				break;
			case 3:
				System.out.println("3");
				break;
			case 4:
				System.out.println("종료");
				break;
			default:
				System.out.println("똑바로 골라라");
				break;
				}
		}while(a!=4);
			
		
			
		

	}

}
