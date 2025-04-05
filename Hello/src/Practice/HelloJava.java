package Practice;

import java.util.*;

public class HelloJava {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		try {
		int k = 디바이드(a, b);
		System.out.println(k);
		}catch( ArithmeticException i){
			System.out.println("0은 암댐");
		}

	}

	public static int 디바이드(int a, int b) throws ArithmeticException,ClassCastException{
		int k = a/b;
		return k;
	}

}