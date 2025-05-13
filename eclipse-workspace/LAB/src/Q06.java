import java.util.Scanner;

public class Q06 {

	public static void main(String[] args) {
		
		boolean bo = true;
		int cnt =0;
		int hap=0;
		Scanner sc = new Scanner(System.in);
		while(bo) {
		System.out.print("성적을 입력하라:");
		int a =sc.nextInt();
		
		hap+=a;
		cnt+=1;
		if(a<0) {
			cnt=cnt-1;
			bo=false;
		}
		
		}System.err.println("총점:"+hap+" 입력횟수:"+cnt+" 평균:"+(double)(hap/cnt));
		

	}

}
