package firstJava;


class Employee{
	float salary =40000;
	
}


class Programmer extends Employee{
	int bonus=10000;
}

public class Example5 {

	public static void main(String[] args) {
		
		Programmer p =new Programmer();
		System.out.println("Programmer Saslary is : "+p.salary);
		System.out.println("Bonus of progrmmer is :  "+ p.bonus);
		
	}
}
