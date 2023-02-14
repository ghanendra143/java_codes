package newDateAndTimeApi;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;

public class LocalDateTimeEx {
	
	public static void main(String[] args) {
		
		// get the current date and time
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("date : "+dateTime.toLocalDate()+"\n"+"time : "+dateTime.toLocalTime());
		
		Month mon = dateTime.getMonth();
		int day = dateTime.getDayOfMonth();
		DayOfWeek d = dateTime.getDayOfWeek();
		
		System.out.println("Today : "+d);
		
		// for tomorrow -> plus(1)
		System.out.println("Tomorrow : "+d.plus(1));
		
		// for yesterday -> minus(1)
		System.out.println("Yesterday : "+d.minus(1));
		
		System.out.println("month : "+mon+"\t day : "+d + "\t date : "+day);
		
		// getting random date (12-nov-2018)
		LocalDate randomDate = LocalDate.of(2018, Month.NOVEMBER, 12);
		System.out.println("random date is : " + randomDate);
		
		// parse a string 
		LocalDate locDate = LocalDate.parse("2019-12-21");
		System.out.println(locDate);
		
		// local time 
		LocalTime t = LocalTime.parse("15:12:13");
		System.out.println(t);
		
		// zoned date time API
		ZonedDateTime zdt = ZonedDateTime.now();
		System.out.println(zdt);
		
		ZoneId zid = ZoneId.of("Europe/Paris");
		System.out.println(zid);
		
		ZoneId currentZone = ZoneId.systemDefault();
		System.out.println(currentZone);
		
		// all different time zones
//		for(String s:ZoneId.getAvailableZoneIds()) {
//			System.out.println(s);
//		}
		
		System.out.println("-----------------------------------------\n");
		
		// Chrono Units
		LocalDate today = LocalDate.now();
		System.out.println("Current date : "+today);
		
		// add 1 week to todays date : 
		LocalDate nextWeek = today.plus(1, ChronoUnit.WEEKS);
		System.out.println("next week : "+nextWeek);
		
		// adding days in the todays date
		LocalDate futureDay = today.plus(3, ChronoUnit.DAYS);
		System.out.println(futureDay.getDayOfWeek());
		
		// adding months in the current date : 
		LocalDate futureMonth = today.plus(1, ChronoUnit.MONTHS);
		System.out.println(futureMonth);
		System.out.println(futureMonth.getMonth());
		
		// adding years in the current date :
		LocalDate futureYear = today.plus(1, ChronoUnit.YEARS);
		System.out.println(futureYear+" -- "+futureYear.getYear());
		
		// adding decades in the current date :
		LocalDate futureDecade = today.plus(1, ChronoUnit.DECADES);
		System.out.println(futureDecade);
		System.out.println("next dacade : "+futureDecade.getYear());
		
		// period and duration :
		// period :
		Period days = Period.between(today, nextWeek);
		System.out.println("period : "+days.getDays()+" days");
		
		Period years = Period.between(today, futureDecade);
		System.out.println("period : "+years.getYears()+" years");
		
		// duration : 
		LocalTime t1 = LocalTime.now();
		Duration twoHours = Duration.ofHours(2);
		LocalTime t2 = t1.plus(twoHours);
		
		Duration duration = Duration.between(t1, t2);
		System.out.println("duration : "+duration.toHours()+" hours");
		
		// temporal adjustors : 
		System.out.println("current date : "+today);
		
		// next Tuesday from today
		LocalDate nextTuesday = today.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
		System.out.println("next Tuesday date : "+nextTuesday);
		
		// second Saturday of next month : 
		LocalDate firstInYear = LocalDate.of(today.getYear(), today.getMonth(), 1);
		Month mahina = firstInYear.getMonth().plus(1);
		System.out.println("month is : "+mahina);
		
		System.out.println(firstInYear.getMonthValue());
		LocalDate secondSaturday = firstInYear.with(TemporalAdjusters.nextOrSame(DayOfWeek.SATURDAY))
											  .with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
		System.out.println("2nd saturday in sep is : "+secondSaturday);
	
		// backward compatibility : 
		Date date = new Date();
		System.out.println("current date : "+date);
		
		// get instance of current date : 
		Instant now = date.toInstant();
		System.out.println("date to LocalDateTime : "+now);
		
		ZoneId zid2 = ZoneId.systemDefault();
		System.out.println("current zone is : "+zid2);
		
		LocalDateTime dt = LocalDateTime.ofInstant(now, zid2);
		System.out.println("date and time with ms : "+dt);
		
		ZonedDateTime zdt2 = ZonedDateTime.ofInstant(now, zid2);
		System.out.println("date with zone : "+zdt2);
		
	}
	
}
