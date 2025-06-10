package chap07;

public class 디스 {
	디스(){
		this(20);
		System.out.println("this");
	}
	디스(int a){
		this(30,40);
		System.out.println("int a의 값:"+a);
	}
	디스(int a,int b){
		System.out.println("int a, int b의 값: "+a+" "+b);
		
	}

}
