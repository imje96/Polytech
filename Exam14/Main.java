package Exam_14;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
	public static void main(String[] args) {
//		현재의 날짜를 Date 형으로 얻는다
		Date now = new Date();
//		얻은 날짜정보를 Calendar 에 설정한다
		Calendar cal = Calendar.getInstance();
		cal.setTime(now);
//		Calendar 에서 일(day) 값을 얻는다.
		int day = cal.get(Calendar.DATE);
//		얻은 값에 100을 더한 값을 Calendar 의 일 에 설정한다
		cal.set(Calendar.DATE, day + 100);
//		cal.add(Calendar.DATE, 100);
//		Calendar 의 날짜정보를 Date 형으로 변환한다
		Date futureDate = cal.getTime();
//		SimpleDateFormat 을 이용하여 Date 인스턴스의 내용을 표시한다
		SimpleDateFormat simformat = new SimpleDateFormat("서기 yyyy년 MM월 dd일");
		String result = simformat.format(futureDate);
		System.out.println(result);
	}
}
