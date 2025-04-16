
public class Catmodel {

	public static void main(String[] args) {
		Cat catObj= new Cat();
		catObj.breed="페르시안 고양코";
		catObj.color="흰색";
		System.out.println("품종은 "+catObj.breed);
		System.out.println("색상은 "+catObj.color);
		System.out.println("나이는 "+catObj.age);
		catObj.eat();
		catObj.meow();
		catObj.scratch();
		
		Cat cat1 = new Cat("페르시안");
		Cat cat2 = new Cat("샴");
		Cat cat3 = new Cat();
		cat3.breed="러시안블루";
		System.out.println(cat1.age);
		System.out.println("첫번째 고양이 품종: "+cat1.breed);
		System.out.println("두번째 고양이 품종: "+cat2.breed);
		System.out.println("세번째 고양이 품종: "+cat3.breed);
		

	}

}
