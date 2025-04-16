import java.util.*;

public class Loop02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	     Scanner sc = new Scanner(System.in);
	     
	     
	     int choice =1;
	     
	     while(choice==1) {
	    	 System.out.println("홀짝을 판별할 숫자를 입력하세요.");
	    	 int a= sc.nextInt();
	    	 if(a%2==0) {
	    		 System.out.println("짝수입니다.");
	    		 
	    	 }else {
	    		 System.out.println("홀수입니다.");
	    	 }System.out.println("계속하시려면 1, 아니면 0을 누르세요");
	    	 choice = sc.nextInt();
	     }System.out.println("종료.");
	     
	  
	
		}
	}


