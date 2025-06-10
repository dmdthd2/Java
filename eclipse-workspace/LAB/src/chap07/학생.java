package chap07;

public class 학생 {
	int id;
	String name;
	
	학생(){
		System.out.println("헤헤");
	}
	
	
	
	void insert(int p1,String p2) {
		id= p1;
		name=p2;
	}
	void printInfo() {
		System.out.println("아이디: "+id);
		System.out.println("이름: "+name);
	}

}
