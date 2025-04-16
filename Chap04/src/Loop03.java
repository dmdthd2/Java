import java.util.*;

public class Loop03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("10보다 큰 수를 입력하세요");
		int a =sc.nextInt();
		int sum =0;
		
		do {
			sum+=a;
			a--;
		}while(a>=10);
		System.out.println("합계: "+sum);

	}

}

