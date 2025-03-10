package firstJava;

public class SwitchPattern {

	public static void main(String[] args) {
		
		
		String day ="Sunday";
		String result="";
		
		result=switch (day) {
		case "Sunday": yield "6 am";
		
		case "Monday": yield "8 am";
			
			
		default: yield "7 am";
		};
		System.out.println(result);
	}
}
