import java.util.Scanner;

public class Star {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("5 이상의 홀수를 입력하세요: ");
        int n = sc.nextInt();

        if (n < 5 || n % 2 == 0) {
            System.out.println("5 이상의 홀수만 입력 가능합니다.");
            return;
        }

        int mid = (n / 2) + 1; // 가운데 열 번호

        for (int i = 1; i <= n; i++) {         // 행
            for (int j = 1; j <= n; j++) {     // 열
                if (i == 1 || i == 2) {
                    if (j == mid) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else if (i == mid) {
                    System.out.print("*");
                } else if (i > mid) {
                    if (j == mid - (i - mid) || j == mid + (i - mid)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
