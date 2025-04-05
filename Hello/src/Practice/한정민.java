package Practice;
import java.util.*;

public class 한정민 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("한정민 연구소에 오신 걸 환영합니다");
		Scanner sc = new Scanner(System.in);
		System.out.println("그녀의 정보를 알려드리지요 궁금하신 점이 무엇입니까");
		
		boolean pig = true;
		while(pig) {
			System.out.println("\n1.성격\n2.외모\n3.전남친들\n4.흑역사\n5.더 이상 안궁금해");
			int a= sc.nextInt();
			
			switch(a) {
			case 1:
				System.out.println("(1)착함\n(2)상처 잘 받음\n(3)변태같음");
				System.out.println();
				System.out.println("또 다른 궁금하신 점이 있으십니까?");
				break;
			
			case 2:
				System.out.println("그녀가 가는 곳마다 치근덕 거리는 남자가 있을 정도임 그러나 본 개발자는 조금 생각이 다름");
				System.out.println();
				System.out.println("또 다른 궁금하신 점이 있으십니까?");
				break;
			case 3:
				System.err.println("(1)김현수\n(2)이수민\n(3)박원우(?)\n(4)김민수\n(5)너 창용이랑도 사겼냐\n(6)차승준ㅋㅋㅋㅋ\n(7)김민규ㅋㅋㅋㅋ");
				System.out.println();
				System.out.println("또 다른 궁금하신 점이 있으십니까?");
				break;
			case 4: 
				System.out.println("들으면 다 알지만 떠올리려니 생각이 잘 안남 생각나는대로 업데이트 예정");
				System.out.println();
				System.out.println("또 다른 궁금하신 점이 있으십니까?");
				break;
			case 5:
				pig= false;
				System.out.println("프로그램 종료");
				break;
			
		
		}
	}
	}

}
