
public class Q02 {

	public static void main(String[] args) {
		
		int hap =0;
		for(int i =1; i<101; i++ ) {
			if(i%2==0) {
				hap+=i;
			}
		}
		System.out.println("100까지 짝수의 합"+hap);

	}

}
