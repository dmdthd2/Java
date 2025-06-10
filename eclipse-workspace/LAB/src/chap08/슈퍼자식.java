package chap08;

public class 슈퍼자식 extends 슈퍼{

	void 슈우퍼() {
		
		super.슈우퍼();
		System.out.println("자식 슈우퍼");
	}
	void 슈퍼() {
		int a =30;
		int b= 80;
		System.out.println(a+b+" 자식 a,b");
		System.out.println(super.a+super.b+" 부모 a,b ");
	}
}
