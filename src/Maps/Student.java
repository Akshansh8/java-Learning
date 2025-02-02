package Maps;

import java.util.HashMap;

class School{
	int id;
	String schoolName;
	
	@Override
	public String toString() {
		return "School [id=" +id+ ", name="+schoolName+"]";
	}
	
	
	@Override
	public void finalize() {
		/*
		 * This will not be printed bcz hashMpa prefers over gc
		 */
		System.out.println("Garbage Cleaning");
	}
}

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		School sc = new School();
		HashMap hm = new HashMap();
		
		hm.put(1, sc);
		System.out.println(hm);
		sc = null;
		
		System.gc();
		System.out.println("last line");
       
	}

}
