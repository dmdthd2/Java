
public class Example03 {

	public static void main(String[] args) {
		int[][] mA = new int[2][4];
		mA[0][0] = 2;
		mA[0][1] = 5;
		mA[0][2] = 7;
		mA[0][3] = 4;
		mA[1][0] = 9;
		mA[1][1] = 3;
		mA[1][2] = 2;
		mA[1][3] = 8;
		int sum1=0, sum2 = 0;
		
		for(int i =0; i<4; i++) {
			sum1 += mA[0][i];
			}
		System.out.println("첫번째 행의 합계: "+sum1);
		for(int i =0; i<4; i++) {
			sum2 += mA[1][i];
			}
		System.out.println("두번째 행의 합계: "+sum2);

	}

}
