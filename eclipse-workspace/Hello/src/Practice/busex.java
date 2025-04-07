package Practice;

public class busex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c =new Bus();
		c.bb();
		c.run();
		
		Bus b= (Bus)c;
		b.bb();
		b.run();
	}

}
