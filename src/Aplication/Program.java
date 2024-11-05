package Aplication;

import java.util.Scanner;

import Entities.Account;
import Excepitions.DomainExcepetion;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.println("Enter account data");
		System.out.print("Number:");
		int number = sc.nextInt();
		System.out.print("Holder:");
		sc.next();
		String holder = sc.next();
		System.out.print("Initial balance:");
		double balance = sc.nextDouble();
		System.out.print("Withdraw limit:");
		double withDrawLimit = sc.nextDouble();
		Account client = new Account(number,holder,balance,withDrawLimit);
		
		System.out.println();
		System.out.print("Enter amount for withdraw:");
		client.withDraw(sc.nextDouble());
		System.out.print("New balance:" + String.format("%.2f", client.getBalance()));
		}
		catch (DomainExcepetion e) {
			System.out.println("Withdraw error:" + e.getMessage());
		}
		
		
		sc.close();
		
		
		
	}

}
