import java.util.*;

public class 시발 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("몇줄나비?");
		int a = sc.nextInt();
		
		for(int i=1; i<=a; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			for(int k=1; k<=2*(a-i); k++) {
				System.out.print(" ");
			}
			for(int h =1; h<=i; h++) {
				System.out.print("*");
			}System.out.println();
		}
		for(int i =a; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			for(int k=1; k<=2*(a-i); k++) {
				System.out.print(" ");
			}
			for(int h =1; h<=i; h++) {
				System.out.print("*");
			}System.out.println();
			
		}
	}

}
