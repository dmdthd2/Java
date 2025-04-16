
public class Studentmo {

	public static void main(String[] args) {
		System.out.println("****학생 주소록****");
		Student st1 =new Student();
		st1.id=20221004;
		st1.name="홍길순";
		st1.printInfo();
		System.out.println("****학생 주소록****");
		Student st2 =new Student();
		st2.insertRecord(2001324, "김은송");
		st2.printInfo();

	}

}
