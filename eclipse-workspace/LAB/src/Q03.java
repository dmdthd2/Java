import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하라");
		int a = sc.nextInt();
		int hap =0;
		for(int i =1; i<=a; i++) {
			if(i%2!=0) {
				hap+=i;
			}
		}System.out.println(a+"까지의 합: "+hap);
	}

}
