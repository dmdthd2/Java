import java.util.*;

public class If04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("3개의 정수를 입력하세요.");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a>b&&a>c) {
			System.out.println(a+"는 가장 큰 정수입니다.");
			}else {
				System.out.println(a+"는 가장 큰 정수가 아닙니다.");
			}
				
	}

}
