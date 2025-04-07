import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       
       System.out.println("몇줄 사각형을 만들까");
       int a = sc.nextInt();
       
       for(int i=1; i<=a; i++) {
    	   if(i==1||i==a) {
			   for(int j =1; j<=a; j++) {
				   System.out.print("*");
			   }
		}else {
			for(int k =1; k<=a; k++ ) {
			if(k==1||k==a||k+i==a+1) {
				System.out.print("*");
			}else {
				System.out.print(" ");
			}
		}
    	   
       
       }System.out.println();
       }
}
}