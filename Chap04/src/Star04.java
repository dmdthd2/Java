import java.util.*;

public class Star04 {

	public static void main(String[] args) {
		//입력한 수의 2배 길이인 나비 출력하기
        Scanner sc = new Scanner(System.in);
        System.out.print("나비의 반을 몇줄로 출력할까요? (3미만은 돌연변이 나비)");
        int a = sc.nextInt();
        
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
            	System.out.print("*");
            }
            for (int j = 1; j <= 2 * (a - i); j++) { 
            	System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) { 
            	System.out.print("*");
            }
            System.out.println();
        }

        for (int i = a; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
            	System.out.print("*");
            }
            for (int j = 1; j <= 2 * (a - i); j++) {
            	System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
            	System.out.print("*");
            }
            System.out.println();
        }


	}

}
