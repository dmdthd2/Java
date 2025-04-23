import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int j = 0;  
        int h = 0;  

        
        while (true) {
            System.out.print("정수를 입력하세요 (종료-1): ");
            a = sc.nextInt();

            if (a == -1) {
                break;  
            }

            
            if (a % 2 == 0) {
                j++;  
            } else {
                h++;   
            }
        }
        System.out.print("짝수 개수: " + j);
        System.out.println("홀수 개수: " + h);
        System.out.println("전체: "+(j+h));
    }
}
