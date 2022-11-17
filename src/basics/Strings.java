package basics;

public class Strings {

		public static void main(String[] args) {
			String bookTitle;
			String wordChoice = "Ring";
			bookTitle= "The Lord of the Rings";
			if (bookTitle.contains("Ring")){
				System.out.println("The book contains the word " + wordChoice);
			}
			
			String browser = "Brave";
			//Java is case sensitive so it is a good idea to use the .equalsignorecase 
			if(browser.equalsIgnoreCase("brave")) {
				System.out.println("The browser is brave");
			}
			
			String firstName = "Dani";
			String lastName = "Galloway";
			String SSN = "123456789";
			String DOB = "11061991";
			
			System.out.println("There are " + SSN.length() + " digits in your SSN (not including the - )");
			System.out.println("The SSN is " + SSN.substring(0,3) + "-" + SSN.substring(3, 5) + "-" + SSN.substring(5,9));
			System.out.println("The DOB is " + DOB.length() + " digits long (not including the / )"); 
			System.out.println("The DOB is " + DOB.substring(0,2) + "/" + DOB.substring(2,4) + "/" + DOB.substring(4,8));
			//Print the initials plus last 4 digits of SSN
			System.out.println("Your Generated ID Tag is: ");
			System.out.print(firstName.substring(0,1));
			System.out.print(lastName.substring(0,1));
			System.out.print(DOB.substring(0,8));
			System.out.println(SSN.substring(5));
		}
}