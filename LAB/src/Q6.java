import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean bo= true;
		int hap=0;
		int count=0;
		
		
		while(bo){
			System.out.print("점수를 입력하세요(종료하려면 -1): ");
			int s = sc.nextInt();
			hap+=s;
			count+=1;
			if(s==-1) {
				hap=hap+1;
				count=count-1;
				double avg=hap/count;
				System.out.printf("총점: "+hap+ "입력횟수 :"+count+ "평균 :"+avg);
				System.out.println();
			}
			
		}

	}

}
