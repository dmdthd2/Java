import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("두자리 정수를 입력하세요 ");
        int a = sc.nextInt();

                if (a < 10 || a > 99) {
            System.out.println("두자리 정수여야 합니다.");
            
                }
        while (a > 0) {
            int t = a / 10;  
            int o = a % 10;  
            int hap = t + o;  
            System.out.print(a+" ");
            a = a - hap;
            if (a <= 0) {
            	System.out.println();
                System.out.println("결과가 0 이하가 되어 종료합니다.");
                break;
            }
        }
    }
}