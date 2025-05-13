
public class me06 {

	public static void ma(int a,int b) {
		System.out.println(a*b);
		}
	public static void ma(int a) {
		System.out.println(a*a);
		}
	public static void ma(int a,double b) {
		System.out.println(a*b);
		}
	public static void ma(double a,int b) {
		System.out.println(a*b);
		}
	public static void main(String[] args) {
		ma(5,3);
		ma(5);
		ma(5,3.14);
		ma(5.2,5);
	}

}
