
public class Q14 {
    public static void main(String[] args) {
        
        
        for (int i = 0; i < 5; i++) {
           for (char ch = (char)('A' + i); ch < 'A' + i + 5; ch++) {
                System.out.print(ch);  
            }
            System.out.println(); 
        }
    }
}
