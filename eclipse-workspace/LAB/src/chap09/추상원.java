package chap09;

public class 추상원 extends 추상모양{
	double r;
	
	public 추상원(String color ,double r) {
		super(color);
		System.out.println("추상원 클래스 생성자 호출");
		this.r=r;
		
	}
	double area() {
		return r*r*3.14;
	}
	public String toString() {
		return "원 색상은 "+super.getColor()+" 그리고 면적은 "+area();
	}
}