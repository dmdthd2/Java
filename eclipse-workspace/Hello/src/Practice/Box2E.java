package Practice;

public class Box2E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box2<Object> b = new Box2<>();
		b.setObj(3+"명의 엄마 "+(1+2+2)+"계속 가능?");
		Object o= b.getObj();
		
		Box2<String> b2 = new Box2<>();
		b2.setObj("존나 어렵네 시발");
		String s = b2.getObj();
		
		Box2<Integer> b3 =new Box2<>();
		b3.setObj(18);
		int v =b3.getObj();
		
		System.out.println(o+s+v);

	}

}
