package chap10;

public class lang {
    public static void main(String[] args) {
    	// String 클래스 사용 예시
        String str = "Hello";
        System.out.println(str.length()); // 문자열 길이 출력

        // Math 클래스 사용 예시
        System.out.println(Math.random()); // 0.0~1.0 사이의 랜덤값 출력

        // Integer 클래스 사용 예시
        Integer num = Integer.valueOf("123");
        System.out.println(num); // 문자열을 정수로 변환하여 출력

        // StringBuffer 클래스 사용 예시
        StringBuffer sb = new StringBuffer("abc");
        sb.append("def");
        System.out.println(sb); // 문자열 추가 후 출력

        // StringBuilder 클래스 사용 예시
        StringBuilder sb2 = new StringBuilder("xyz");
        sb2.insert(1, "123");
        System.out.println(sb2); // 문자열 삽입 후 출력
    }
}
