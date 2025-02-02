package Collection;

import java.util.ArrayList;
import java.util.Collections;

class Employee1 implements Comparable<Employee1>{
	private String name;
	public int age;
	
	public Employee1(){
		name = "Akshansh";
		age = 25;
	}
	
	public Employee1(int age, String name ) {
		this.name = name;
		this.age = age;
	}
	
	public Employee1(String name) {
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
	
	@Override
	public int compareTo(Employee1 ref) {
		if(this.age>ref.age) {
			return 1;
		}		else {
			return -1;
		}
	}
}

public class Class2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 e1 = new Employee1();
		System.out.println(e1);
		
		Employee1 e2 = new Employee1("Dev");
		System.out.println(e2);
		
		Employee1 e3 = new Employee1(24, "Kiran");
		System.out.println(e3);
		
		ArrayList a1 = new ArrayList();
		a1.add(e1);
		a1.add(e2);
		a1.add(e3);
		
		System.out.println(a1);
		Collections.sort(a1);
		System.out.println(a1);

	}

}
