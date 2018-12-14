package basics;

public class Strings {

	
	public static void main(String[] args) {
		String bookTitle;
		String wordChoice = "Ring";
		bookTitle = "The Lord Of the Rings";
		
		if (bookTitle.contains(wordChoice)) {
			System.out.println("The book contains the word " + wordChoice);
		}
		
		String browser = "Chrome";
		// (browser == "chrome")
		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("The browser is chrome");
		}
		
		String firstname = "Yusree";
		String lastname = "Karlie";
		String Mobile = "27789041287";
		
		System.out.println("There are " + Mobile.length() + "didgits in your Mobile");
		
		// Print the initials plus last 4 digits of Mobile
		System.out.println(firstname.substring(0, 1));
		System.out.println(lastname.substring(0, 3));
		System.out.println(Mobile.substring(0));
	}
		
}
