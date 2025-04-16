
public class Array04 {

	public static void main(String[] args) {
		int rows =2, colomns=3;
		int[][] fA = { {2,3,4},{3,2,1} };
		int[][] sA = { {1,2,3},{-4,-2,1} };
		
		int sum [][]=new int[rows][colomns];
		
		for (int i =0; i<rows; i++) {
			for (int j =0; j<colomns; j++) {
				sum[i][j]= fA[i][j]+sA[i][j];
				
			}
		}System.out.println("두 행렬의 합: ");
		for (int i =0; i<rows; i++) {
			for (int j =0; j<colomns; j++) {
				System.out.println(sum[i][j]+" ");
			}System.out.println();
		}
	}

}
