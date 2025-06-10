package chap10;
import java.util.Date;
import java.util.Calendar;
import java.util.StringTokenizer;
import java.util.Random;

public class util {
    public static void main(String[] args) {
    	 // Date 클래스 사용 예시
        Date date = new Date();
        System.out.println(date); // 현재 날짜와 시간 출력

        // Calendar 클래스 사용 예시
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.get(Calendar.YEAR)); // 현재 연도 출력

        // StringTokenizer 클래스 사용 예시
        StringTokenizer st = new StringTokenizer("Java,C,Python", ",");
        while(st.hasMoreTokens()) {
            System.out.println(st.nextToken()); // 구분자로 문자열 분리하여 출력
        }

        // Random 클래스 사용 예시
        Random rand = new Random();
        System.out.println(rand.nextInt(100)); // 0~99 사이의 랜덤 정수 출력
    }
}
