package test;

import java.util.Scanner;

public class st05 {
	public static int meth(int a, int b) {
		int result;
		if(a>b) {
			result=a;
			
		}else {
			result=b;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("비교할 두 수를 입력하라");
		int a=sc.nextInt();
		int b= sc.nextInt();
		int r =meth(a,b);
		System.out.println(a+"와(과) "+b+"중에서 "+r+"이(가) 큽니다.");

	}

}
