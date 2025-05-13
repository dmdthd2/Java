
public class ar02 {

	public static void main(String[] args) {
		double ar[]= {80,90,86.5,18.7,66.5};
		double sum=0.0;
		
		for (int i =0; i<ar.length; i++) {
			sum+=ar[i];
			
		}System.out.println("합: "+sum);
		System.out.println("평균: "+sum/ar.length);

	}

}
