public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hap=0;
		for(int i =1; i<=10; i++) {
			if(i%2==0 &&i<9) {
				System.out.print(i+" + ");
				hap+=i;
				}
			else if(i>9) {
				System.out.print(i);
				hap+=i;
			}
		}System.out.print(" = "+hap);

	}

}
