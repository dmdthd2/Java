public class Q15 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print("*".repeat(9 - i));
            if (i > 0) System.out.print(" ");
            System.out.print("*".repeat(i));
            System.out.println();
        }
    }
}