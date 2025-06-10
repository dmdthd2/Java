package chap11;

import java.util.Scanner;

public class 예외 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("0말고 정수를 입력하라");
		int n1 =sc.nextInt();
		
		try {
			int n2=10/n1;
			System.out.println(n2);
		}catch(Exception e) {
			System.out.println("올바르게 해라");
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}System.out.println("외부");

	}

}
