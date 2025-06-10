package chap09;

public abstract class 추상모양 {

	String color;
	
	abstract double area();
	public abstract String toString();
	
	public 추상모양(String color) {
		System.out.println("shape 클래스 생성자 호출");
		this.color =color;
	}
	public String getColor() {
		return color;
	}
}
