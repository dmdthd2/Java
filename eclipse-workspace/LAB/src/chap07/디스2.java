package chap07;

public class 디스2 {
	int age;
	String name;
	String country;

	디스2(){
		this("홍길순");
		
	}
	디스2(String mname){
		this(mname,10);
		
	}
	디스2(String mname, int mage){
		this(mname,mage,"Korea");
	}
	디스2(String mname, int mage,String mcountry){
		name=mname;
		age =mage;
		country= mcountry;
	}
	
		void printInfo(){
		System.out.println(name);
		System.out.println(age);
		System.out.println(country);
	}
}
