import java.util.*;

public class Switch01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		
		int a =sc.nextInt();
		
		switch(a/10) {
		case 10,9 :
			System.out.println("A학점");
		break;
		case 8 :
			System.out.println("B학점");
			break;
		case 7 :
			System.out.println("C학점");
			break;
		case 6 :
			System.out.println("D학점");
			break;
		default :
			System.out.println("F학점");
			
		
		}

	}

}
