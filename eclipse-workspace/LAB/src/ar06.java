
public class ar06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a1 ="java programing ";
		String a2 = "java";
		String a3 =" programing ";
		String a4 = a2.concat(a3);
		String a5 = a1.trim();
		String a6 = new String("java");
		String a7 = new String("java");
		
		if (a1==(a4)) {
			System.out.println("같아요");
		}else {
			System.out.println("달라요");
		}
		if (a1.equals(a5)) {
			System.out.println("같아요");
		}else {
			System.out.println("달라요");
		}
		if (a6==(a7)) {
			System.out.println("같아요");
		}else {
			System.out.println("달라요");
		}
		}

}
