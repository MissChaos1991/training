package basics;

public class SalaryCalculator {
	public static void main(String[] args) {
		// Let's Create a Variable to Define our Career
		
		//Declare a variable
		String career;
		System.out.println("Program Is Starting");
		career= "software developer";
		System.out.println("My career " + career);
		
		//Declare & Define
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 42.50;
		
		double salary = hoursPerWeek * weeksPerYear * rate;
		System.out.println("My salary as a " + career + "at the rate of $"+ rate + " per hour $"  + salary + " per year.");
		
		//Compute our annual salary
		//rate*hoursPerWeek*weeksPerYear
	}
}
