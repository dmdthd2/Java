package chap11;

public class 사용자정의예외몸체 {
	void check(int w) throws 사용자정의예외{
		if(w<100) {
			throw new 사용자정의예외("사용자 정의 예외다 이눔아");
		}
	}

	public static void main(String[] args) {
		사용자정의예외몸체 ob = new 사용자정의예외몸체();
		 try {
			 ob.check(60);
		 }catch(Exception e) {
			 System.out.println("예외처리입니다");
			 System.out.println(e.getMessage());
		 }
	}

}
