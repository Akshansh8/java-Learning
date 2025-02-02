package Multithreading;

import java.util.Scanner;

import org.w3c.dom.ls.LSOutput;

class Banking extends Thread{
	public void run() {
		System.out.println("Activity 1 started");
		System.out.println("Please enter username");
		Scanner scanner = new Scanner(System.in);
		scanner.next();
		System.out.println("Please enter password");
		scanner.next();
		System.out.println("Activity 1 ended");
	}
}

class Alpha extends Thread{
	public void run() {
		System.out.println("Activity 2 started");
		for(int i = 0; i<97;i++) {
			System.out.println((char)i);
			
		}
		System.out.println("Activity 2 ended");
	}

}

class Num extends Thread{
	public void run() {
		System.out.println("Activity 3 started");
		for(int i = 0; i<10;i++) {
			System.out.println(i);
			
		}
	}
}

public class LaunchThread1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Resources opened");
		Banking b = new Banking();
		Alpha a = new Alpha();
		Num n = new Num();
		
		System.out.println(b.isAlive());
		b.start();
		System.out.println(b.isAlive());
		a.start();
		n.start();
		b.join();
		n.join();
		a.join();
		
		System.out.println("Resources closed");
		System.out.println("Main thread completed the work");

	}

}
