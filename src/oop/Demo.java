package oop;

	class Person{
		
		String name;
		String email;
		String phone;
		
		void walk(){
			System.out.println(name + " is walking");
		}
		void eat(){
			System.out.println(email);
		}
		void sleep(){
			System.out.println(name + " is sleeping");
		}
	}

public class Demo {

	public static void main(String[] args){
		//Instantiating an object
		Person person1 = new Person();
		
		//Define some properties
		person1.name = "Joe";
		person1.email= "joe@testemail.com";
		person1.phone= "8035550123";
		
		//Abstraction
		person1.walk();
		
		
		Person person2= new Person();
		person2.name = "Sara";
		person2.sleep();

		/*
	
	// Attributes, variables, adjectives, descriptors
	String name = "Joe";
	String email = "joe@testemail.com";
	String phone = "8035550123";
	
	//Action, activity, behavior
	//System.out.println(name + " is walking");
	walking(name);
	System.out.println(name + " is eating");
	
	//What if we wanted to do this for another person?
	String name2 = "Sara";
	String email2 = "sara@testemail.com";
	String phone2 = "8035551234";
	
	//Action, activity, behavior
	walking(name2);
	System.out.println(name2 + " is eating");
	
	//What about binding attributes and properties together?
	
}
	
	// Enhance by adding functions to minimize code
	static void walking(String name) {
		System.out.println(name + " is walking");
		*/
	}
	
}
