
//Name: Tanuphat Sojindamanee
//ID: 6887020
//Section: 1
import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lab11 {
	public static int balance = 3000;

	// ------------Task2----------//
	public static void withDraw(int amount) {
		// ---Put your code here---//
		if (amount < 0) {
			throw new IllegalArgumentException("You must enter amount > 0 ");
		}
		if (amount > balance) {
			throw new IllegalArgumentException("Insufficient amount to withdraw");
		}

		// -------------------------//
		balance -= amount;
		System.out.println("withdraw: " + amount);
		System.out.println("balance: " + balance);

	}

	public static void main(String[] args) {

		// --------------Task1--------------//
		// task1.1
		try {
			System.out.println(3 / 0);
		} catch (Exception e) {
			System.err.println("Cannot divide by 0");
		}

		// task1.2
		int x;
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter number: ");
		try {
			x = reader.nextInt(); // possibly run-time error
			System.out.println("Your number is " + x);

		} catch (InputMismatchException e) {
			System.err.println("Exception occurred.");
		}

		// task1.3
		String[] list = { "$123", "456" };
		try {
			double amount = Double.parseDouble(list[0]);
			System.out.println("The amount at index 2 " + amount);
		} catch (NumberFormatException e) {
			System.err.println("Number format exception.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Index out of bounds.");
		} finally {
			reader.close();
			System.err.println("Program ended.");
		}

		// --------------Task2--------------//
		try {
			int balance = 3000;
			Scanner reader2 = new Scanner(System.in);
			System.out.print("Enter amount: ");
			int bal = reader2.nextInt();
			withDraw(bal);
			reader2.close();

		} catch (Exception e) {
			e.printStackTrace();

		}
	}

}
