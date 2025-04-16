import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		double[][]mA= new double[2][3];
		Scanner sc =new Scanner(System.in);
		
		for (int i =0; i<2; i++) {
			System.out.println("학생 번호"+(i+1));
			System.out.println("국어 점수: ");
			mA[i][0]= sc.nextDouble();
			System.out.println("수학점수: ");
			mA[i][1]= sc.nextDouble();
			mA[i][2]=((mA[i][0]+mA[i][1])/2);
		}
		for(int i =0 ; i<2; i++) {
			System.out.println("학생 번호"+(i+1));
			System.out.print("국어: "+mA[i][0]+ " ");
			System.out.print("수학: "+mA[i][1]+ " ");
			System.out.println("평균: "+mA[i][2]+" ");
		}

	}

}
