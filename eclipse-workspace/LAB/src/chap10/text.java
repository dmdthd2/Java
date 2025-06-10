package chap10;

import java.text.SimpleDateFormat;
import java.util.Date;//util이지만 SimpleDateFormat을 쓰기 위해서 사용

public class text {
    public static void main(String[] args) {
    	  // SimpleDateFormat 클래스 사용 예시
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(new Date())); // 오늘 날짜를 yyyy-MM-dd 형식으로 출력
}
}