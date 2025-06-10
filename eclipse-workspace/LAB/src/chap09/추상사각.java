package chap09;

public class 추상사각 extends 추상모양 {
	
	double l;
	double w;
	
	public 추상사각(String color, double l, double w) {
		super(color);
		System.out.println("추상사각 클래스 생성자 호출");
		this.l=l;
		this.w=w;
		
	}
	double area() {
		return l*w;
		
	}
	public String toString() {
		return "사각형 색상은 " + super.getColor() + " 그리고 면적은 : " + area();

	}

}
