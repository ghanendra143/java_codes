package dateAndTime;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateAndTime {
	
	public static void main(String[] args) {
		
		// display todays date 
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		// displays current time
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		// display current date and time together 
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		System.out.println("date : "+dateTime.toLocalDate()+"\ntime : "+dateTime.toLocalTime());
		
		LocalDate date2 = LocalDate.of(1998, Month.OCTOBER, 21);
		System.out.println(date2);
		
		// format date
		Date dates = new Date();
		SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
		String dt = formatDate.format(dates);
		System.out.println(dt);
		
		DateTimeFormatter obj = DateTimeFormatter.ofPattern("dd/mm/yyyy HH:mm:ss");
		String afterFormat = dateTime.format(obj);
		System.out.println("before format date and time : "+dateTime);
		System.out.println("after format date and time: "+afterFormat);
		
		
	}

}
