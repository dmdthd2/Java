package test;

import java.util.Scanner;

public class st07 {
	public static void meth(int a) {
		double b =3.14;
		System.out.println(2*a*b);
		
	}

	public static void main(String[] args) {
		System.out.println("반지름을 몇으로 할까요?");
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		System.out.print("원의 둘레: ");
		meth(a);

	}

}
