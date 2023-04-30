package 자바1학년;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class 자바1학년_11시간 {
	public static void main(String[] args) {
		
		ZonedDateTime now = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		
		String nowTime = now.getHour() + ":" + now.getMinute() + ":" + now.getSecond();
		System.out.println(nowTime);
	}

}
