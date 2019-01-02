import java.time.*;
import java.time.format.*;
public class DateDemo{
	public static void main(String args[]){

	//	LocalDate date=LocalDate.now();
	//	System.out.println(date);
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy MM dd");
	//	String text=date.format(formatter);

		

		LocalDate dateParse=LocalDate.parse(text,formatter);

		System.out.println(dateParse);
	}
}