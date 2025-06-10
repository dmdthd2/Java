package chap11;

import java.util.Scanner;

public class 다중예외 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력");
		int num =sc.nextInt()	;
		
		int arr[]= new int[5];
		
		try {
			arr[num]=10/num;
			System.out.println(arr[num]);
		}catch(ArithmeticException e) {
			System.out.println("0이 아닌 걸로");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println("배열 크기 확인해라");
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}finally {
			System.out.println("그냥 되는 거야~");
		}
	}

}
