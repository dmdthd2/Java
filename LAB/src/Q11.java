import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s;

        
        while (true) {
            System.out.print("별 개수를 입력하세요: ");
            s = sc.nextInt();

            if (s > 0) {
                break;
            } else {
                System.out.println("0보다 큰 수를 입력하세요.");
            }
        }

        System.out.print("별 개수: ");
        if (s <= 50) {
        	
            for (int i = 0; i < s; i++) {
                System.out.print("*");
            }
        } else {
            for (int i = 0; i < 50; i++) {
                System.out.print("*");
            }
            System.out.print("...*x" + (s - 50));
        }

      
    }
}