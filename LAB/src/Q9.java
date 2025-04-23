
public class Q9 {

	public static void main(String[] args) {
		int hap = 0;

		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				System.out.print("(");
				for (int j = 1; j <= i; j++) {
					System.out.print("1");
					if (j < i) {
						System.out.print("+");
					}
				}
				System.out.print(")");
				if(i<9) {
					System.out.print(" + ");
				}
				hap += i;
			}
		}
		System.out.print(" = " + hap);

	}

}
