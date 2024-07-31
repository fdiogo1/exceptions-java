package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		try {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			int number = input.nextInt();
			input.nextLine();
			System.out.print("Holder: ");
			String holder = input.nextLine();
			System.out.print("Initial balance: ");
			double balance = input.nextDouble();
			System.out.print("Withdraw limit: ");
			double withdrawLimit = input.nextDouble();
			
			Account acc = new Account(number, holder, balance, withdrawLimit);
			
			System.out.print("Enter amount for withdraw: ");
			double withdrawAmount = input.nextDouble();
			
			acc.withdraw(withdrawAmount);
			
			System.out.print("New balance: $" + String.format("%.2f", acc.getBalance()));
		}
		catch (DomainException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.println("Unexpected error.");
		}
			
		input.close();

	}

}
