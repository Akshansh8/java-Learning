package Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

class Information{
	int id;
	String name;
	String city;
	
	public Information(int id, String name, String city) {
		this.id = id;
		this.name = name;
		this.city = city;
	}
	
	public String toString() {
		return "[id=" + id + ", name=" + name + ", city=" + city +"]";
	}
}

public class InformationCenter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Information i1 = new Information(12, "Akshansh", "Raigarh");
		Information i2 = new Information(18, "Kiran", "Jharsuguda");
		Information i3 = new Information(13, "Abhishek", "jamshedpur");
		
		HashMap<Integer, Information> hm = new HashMap<>();
		hm.put(12, i1);
		hm.put(18, i2);
		hm.put(13, i3);
		
		System.out.println("Welcome to information center");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your Id");
		Integer input = sc.nextInt();
		
		Set set = hm.entrySet();
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			Map.Entry<Integer, Information> entry = (Entry)itr.next();
			if(input == entry.getKey()) {
				System.out.println("Entry found");
				System.out.println(entry.getKey()+ ":"+ entry.getValue());
			}
			else {
				System.out.println("Entry not found");
			}
			
		}
	
	}

}
