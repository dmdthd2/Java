public class Q10 {
    public static void main(String[] args) {
        int hap = 0;
        int count = 0; 

        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) {
                hap += i;
                if (count > 0) {
                    System.out.print("+");
                }
                System.out.print("(");
                for (int j = 1; j <= i / 3; j++) {
                    System.out.print("3");
                    if (j < i / 3) {
                        System.out.print("+");
                    }
                }
                System.out.print(")");
                count++;
            }
        }

        System.out.println(" = " + hap);
    }
}
