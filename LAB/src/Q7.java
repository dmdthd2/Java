import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;

        do {
            
            System.out.println("\n=== 메뉴 ===");
            System.out.println("1. 사각형");
            System.out.println("2. 원");
            System.out.println("3. 삼각형");
            System.out.println("4. 종료");
            System.out.print("번호를 선택하세요: ");
            a = sc.nextInt();

            switch (a) {
                case 1:
                    System.out.println("1번을 선택하셨습니다.");
                    break;
                case 2:
                    System.out.println("2번을 선택하셨습니다.");
                    break;
                case 3:
                    System.out.println("3번을 선택하셨습니다.");
                    break;
                case 4:
                    System.out.println("4번을 선택하셨습니다. 프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("잘못 선택하셨어요.");
                    break;
            }
        } while (a != 4);

        
    }
}

