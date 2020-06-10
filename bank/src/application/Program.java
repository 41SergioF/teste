package application;

import java.io.Closeable;
import java.util.Scanner;

import model.entities.Account;
import model.exeptions.BalanceException;
import model.exeptions.LimitExeptions;

public class Program {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		try{
			System.out.println("Enter account data");
			System.out.print("Number: ");
			Integer number = scan.nextInt();
			scan.nextLine();
			System.out.print("Holder: ");
			String name = scan.nextLine();
			System.out.print("Initial balance: ");
			Double iniBalance = scan.nextDouble();
			System.out.print("Withdraw limit: ");
			Double withDrawLimit = scan.nextDouble();
	
			Account account = new Account(number, name, iniBalance, withDrawLimit);
			
			System.out.print("Enter amount for withdraw: ");
			iniBalance = scan.nextDouble();
			account.withDraw(iniBalance);
			System.out.print("New Balance: "+account.getBalance());
		}	
		catch(BalanceException e) {
			System.out.println("Withdraw error: "+e.getMessage());
		}
		catch (LimitExeptions e) {
			System.out.println("Withdraw error: "+ e.getMessage());
		}
		
		scan.close();
	}

}
