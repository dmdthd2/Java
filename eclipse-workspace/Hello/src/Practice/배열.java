package Practice;

import java.util.Scanner;

public class 배열 {

	public static void main(String[] args) {
		//과목 점수의 평균구하기
		int [][]ar =new int[2][3];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<2; i++) {
			System.out.println("학생 번호"+(i+1));
			System.out.println("국어점수: ");
			ar[i][0]=sc.nextInt();
			System.out.println("수학점수: ");
			ar[i][1]=sc.nextInt();
			ar[i][2]=(ar[i][0]+ar[i][1])/2;
			
		}for (int i =0; i<2; i++) {
			System.out.print("학생"+(i+1)+"의 국어점수: "+ar[i][0]);
			System.out.print(" 수학점수: "+ar[i][1]);
			System.out.println(" 평균: "+(double)ar[i][2]);
		}
	}

}
