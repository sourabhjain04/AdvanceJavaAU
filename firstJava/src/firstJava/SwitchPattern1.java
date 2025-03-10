package firstJava;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class SwitchPattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		DayOfWeek day = LocalDate.now().getDayOfWeek();
		String result = "";
		
		result=switch (day) {
		case SATURDAY,SUNDAY->"6 am";
		case MONDAY->"7 am";
		default ->"8 am";
		
		};
		
		System.out.println("Wake-up time : "+result);
		
		
		
		
		
	}
	

}
