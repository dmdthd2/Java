package chap11;

import java.util.Scanner;

public class 드로우쓰 {
	static void check(int num) throws Exception {
		if (num < 0) {
			throw new Exception("0보다 작아요;;");
		} else {
			System.out.println(num);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력");
		int num = sc.nextInt();
		try {
			check(num);
		} catch (Exception e) {
			System.out.println("예외 발생 " + e.getMessage());
			e.printStackTrace();
		}

	}

}
