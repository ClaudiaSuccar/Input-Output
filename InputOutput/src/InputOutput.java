import java.util.Scanner;

public class InputOutput {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is your first name? ");
		String firstName = input.next();
		System.out.println("What is your last name? ");
		String lastName = input.next();
		System.out.println("Welcome to Java, " + firstName + " " + lastName + "!");
		System.out.println("How old are you?");
		int age = input.nextInt();
		if (age > 0 && age < 4) {
			System.out.println("You are a baby.");
		} else if (age > 3 && age < 13) {
			System.out.println("You are a child");
		} else if (age > 12 && age < 20) {
			System.out.println("You are a teenager.");
		} else if (age > 19 && age < 30) {
			System.out.println("You are a young adult.");
		} else if (age > 29 && age < 60) {
			System.out.println("You are an adult.");
		} else if (age > 59) {
			System.out.println("You are a senior.");
		}
		int a = 1;
		System.out.println("List 3 of your favorite things");
		System.out.println("Item 1: ");
		String item1 = input.next();	
		System.out.println("Item 2: ");
		String item2 = input.next();
		System.out.println("Item 3: ");
		String item3 = input.next();
		System.out.println("Your favorite items are " + item1 + ", " + item2 + ", and " + item3 + ".");
	}
}
