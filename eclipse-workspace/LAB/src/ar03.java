import java.util.Scanner;

public class ar03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int ar[][] = new int[2][3];
		for (int i = 0; i < 2; i++) {
			System.out.println("학생" + (i + 1));
			System.out.println("수학점수");
			ar[i][0] = sc.nextInt();
			System.out.println("국어점수");
			int b = sc.nextInt();
			ar[i][1] = b;
			
			ar[i][2]= (ar[i][0]+ar[i][1])/2;
		}
		System.out.println("학생1의 평균"+ar[0][2]);
		System.out.println("학생2의 평균"+ar[1][2]);
	}

}
