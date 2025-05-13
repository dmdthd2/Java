import java.util.Scanner;

public class ar01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] ar =new String[3];
		Scanner sc = new Scanner(System.in);
		
		for(int i =0; i<ar.length; i++) {
			System.out.println("입력해");
			String a =sc.nextLine();
			ar[i]=a;
			
		}
		for(int i =0; i<ar.length; i++) {
			System.out.println(ar[i]);
		}
		
		

	}

}
