
public class Method03 {
	public static int max(int a, int b) {
		int result;
		if(a>b) {
			result=a;
		}else {
			result =b;
			
		}return result;
	}

	public static void main(String[] args) {
		int a=5;
		int b=6;
		int num =max(a,b);
		System.out.println(a+"와 "+b+" 중에서 " +num+"이 더 큽니다.");

	}

}
