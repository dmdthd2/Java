package ㅎㅇ;

import java.text.SimpleDateFormat;

public class Date {

	public static void main(String[] args) {
		java.util.Date d = new java.util.Date();
		System.out.println(d.toString());
		
		SimpleDateFormat sd =new SimpleDateFormat("yyyy년 MM월 dd일 'at' hh시 mm분 ss초 a zzz");
		System.out.println(sd.format(d));
		
		System.out.println(d.getTime());
		long  t = System.currentTimeMillis();
		System.out.println(t);
		System.out.println(t-d.getTime());
	}

}
