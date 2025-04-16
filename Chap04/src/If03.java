import java.util.*;

public class If03 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int a = sc.nextInt();
		
		 if(a>=90) {
			System.out.println("A학점");
		}else if(a>=80) {
			System.out.println("B학점");
		}else if(a>=70) {
			System.out.println("C학점");
		}else if(a>=60) {
			System.out.println("D학점");
		}else {
			System.out.println("F학점");
		}
		
			
	}

}
