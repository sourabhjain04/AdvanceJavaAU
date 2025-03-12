package thirdDay;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {

	String name;
	int salary;
	
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	
	
	
	public String toString() {
		return name +"- $"+ salary;
	}
}



public class ComparableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> employees = new ArrayList<>();
		
		employees.add(new Employee("Alice", 5000));
		employees.add(new Employee("Bob", 4000));
		employees.add(new Employee("Charlie", 7000));
		
		employees.sort(Comparator.comparingInt(e->e.salary));
		
		System.out.println("Sorted Employees: "+ employees);
	}

}
