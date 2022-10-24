package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Usuario;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the account number: ");
		int accoun = sc.nextInt();
		System.out.print("Enter holder name: ");
		String name = sc.next();
		Usuario user = new Usuario(accoun, name);
		
		System.out.print("Enter the initial deposit: ");
		double value = sc.nextDouble();
		user.deposit(value);
		
		
		System.out.println(user);
		
		System.out.print("Depositar valor: ");
		value = sc.nextDouble();
		user.deposit(value);
		
		System.out.println(user);
		
		System.out.print("Sacar valor: ");
		value = sc.nextDouble();
		user.withdraw(value);
		
		System.out.println(user + " - Tax: $ 5.00");
		
		sc.close();

	}

}
