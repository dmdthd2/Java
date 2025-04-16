import java.util.Scanner;

public class Array01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[]mA = new String[3];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("3개의 문자열을 입력하세요.");
		
		for (int i =0; i<3; i++) {
			mA[i]= sc.nextLine(); //nextLine은 공백까지 받아줌
		}
		for(int i=0; i<3; i++) {
			System.out.print(mA[i]+" ");
		}

	}

}
