package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee{
	private String name;
	public int age;
	
	public Employee() {
		name = "Akshansh";
		age = 25;
	}
	
	public Employee(int age, String name ) {
		this.name = name;
		this.age = age;
	}
	
	public Employee(String name) {
		age = 24;
		this.name = name;
	}
	public String getNsme() {
		return name;
	}
	public void setNsme(String nsme) {
		this.name = nsme;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	/*
	 * using to String method bcz sout internally calls to string and to string gives the address
	 * 
	 */
	
	public String toString() {
		return name+ " " +age;
		
	}
}

class Alpha implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if(o1.age>o2.age) {
			return 1;
			
		}
		else {
			return -1;
		}
	}
	
}

public class Class1 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Employee e1 = new Employee();
		System.out.println(e1);
		
		Employee e2 = new Employee("Dev");
		System.out.println(e2);
		
		Employee e3 = new Employee(24, "Kiran");
		System.out.println(e3);
		
		ArrayList a1 = new ArrayList();
		a1.add(e1);
		a1.add(e2);
		a1.add(e3);
		
		System.out.println(a1);
		Alpha alpha = new Alpha();
//		Collections.sort(a1, alpha);
//		System.out.println(a1);
		
		Comparator<Employee> comp = (Employee ref1, Employee ref2)->{
			if(ref1.age > ref2.age) {
				return 1;
			}
			else {
				return -1;
			}
		};
		Collections.sort(a1,comp);
		System.out.println(a1);
	}

}
