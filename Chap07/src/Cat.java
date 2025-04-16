
public class Cat {
	String breed;
	String color;
	int age =10;
	
	Cat(){
		System.out.println("Cat() 생성자 호출");
		
	}
Cat(String pbreed){
	System.out.println("Cat(...) 생성자를 호출합니다");
	breed = pbreed;
		
	}


void eat(){
	System.out.println("냠냠");
}
void scratch(){
	System.out.println("할퀴");
}
void meow(){
	System.out.println("냐옹");
}
}