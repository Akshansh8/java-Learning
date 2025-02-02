package Multithreading;

import java.util.Scanner;

import javax.sound.midi.Soundbank;

class MultiTask implements Runnable{
	public void run() {
		String name = Thread.currentThread().getName();
		
		if(name.equals("BANK")) {
			Banking1 b = new Banking1();
			b.print();
		}
		
		else if (name.equals("NUM")) {
			Num1 n = new Num1();
			n.print();
			
		}
		else {
			Alpha1 a = new Alpha1();
			a.print();
		}
	}
}

class Banking1{
	public void print() {
		System.out.println("Activity 1 started");
		System.out.println("Please enter username");
		Scanner scanner = new Scanner(System.in);
		scanner.next();
		System.out.println("Please enter password");
		scanner.next();
		System.out.println("******** Activity 1 ended *********");
	}
}

class Alpha1{
	public void print() {
		System.out.println("Activity 2 started");
		for(int i = 0; i<97;i++) {
			System.out.println((char)i);
			
		}
		System.out.println("******** Activity 3 ended *********");
	}


}

class Num1{
	public void print() {
		System.out.println("Activity 3 started");
		for(int i = 0; i<10;i++) {
			System.out.println(i);
			
		}
	    System.out.println("******** Activity 3 ended *********");
	}
}

public class LaunchThread2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiTask obj = new MultiTask();
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj);
		Thread t3 = new Thread(obj);
		
		t1.setName("BANK");
		t2.setName("NUM");
		t3.setName("ALPHA");
		
		t1.start();
		t2.start();
		t3.start();

	}

}
