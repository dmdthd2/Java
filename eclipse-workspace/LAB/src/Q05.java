import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 정수를 입력하라");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int hap =0;
		if(a>b) {
		for(int i =b; i<=a; i++) {
			hap+=i;
		}
		
		}else if(b>a){
			for(int i=a; i<=b; i++) {
				hap+=i;
			}
		}System.out.println(hap);
		

	}

}
