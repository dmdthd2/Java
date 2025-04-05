package ㅎㅇ;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Time {

	public static void main(String[] args) {
		LocalDateTime lt = LocalDateTime.now();
		System.out.println(lt);
		
		LocalDate ld1 = LocalDate.of(2019, 3, 11);
		System.out.println(ld1);
		
		LocalTime lt1 = LocalTime.of(20, 3);
		System.out.println(lt1);
		LocalTime lt2 = LocalTime.parse("10:15:30");
		System.out.println(lt2);
		
		LocalDate tt=lt.toLocalDate();
		System.out.println(tt);
		Month m =lt.getMonth();
		System.out.println(lt.getMonth());
		System.out.println(m.getValue());
		System.out.println(lt.getMinute());

	}

}
