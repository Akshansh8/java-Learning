package Enum;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//annotation works on mechanism of an interface

@Target({ElementType.FIELD, ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface Cricketplayer{
	String country() default "India";
	int age()default 35; 
	
}

@Cricketplayer
class Virat{
	@Cricketplayer
	int runs;
	
	@Cricketplayer
	public void setRuns() {
		System.out.println("total runs");
	}
	
}

public class LaunchAn1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Virat vk = new Virat();
		Class class1 = vk.getClass();
		Annotation an = class1.getAnnotation(Cricketplayer.class);
		Cricketplayer cp = (Cricketplayer)an;
		int age = cp.age();
		System.out.println(age);

	}

}
