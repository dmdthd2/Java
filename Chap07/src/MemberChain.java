
public class MemberChain {
	String name;
	String country;
	int age;
	MemberChain(){
		this("김은송");
	}MemberChain(String mName){
		this(mName,25);
	}MemberChain(String mName, int mAge){
		this(mName,mAge,"대한민국");
	}MemberChain(String mName, int mAge,String mCountry){
		name=mName;
		age = mAge;
		country =mCountry;
	}void printInfo(){
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
		System.out.println("국적: "+country);
	}
	

}
