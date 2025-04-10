package test;

import java.util.Scanner;

public class st04 {
	public static int meth(int a, int b) {
		return a+b;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두수를 입력하라");
		int a=sc.nextInt();
		int b= sc.nextInt();
		int sum =meth(a,b);
		
		System.out.println(sum);
		

	}

}
