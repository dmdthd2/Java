import java.util.*;

public class If02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int a =sc.nextInt();
		
		if(a%2==0) {
			System.out.println(a+" 는 짝수입니다.");
		}else {
			System.out.println(a+" 는 홀수입니다.");
		}
		System.out.println("이 문장은 if문 외부에 있습니다.");

	}

}
