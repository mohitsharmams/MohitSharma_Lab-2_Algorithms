package com.PayMoney;

import com.PayMoney.Display.DisplayTransactions;
import com.PayMoney.Targets.Targets;
import com.PayMoney.Transactions.Transactions;

import java.util.Scanner;

public class PayMoneyMain {
	static int size;
	static double arr[];
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter total no. of transactions in a day: ");
		size = sc.nextInt();
		
		arr = new double[size];
		Transactions tr = new Transactions();
		arr = tr.dailyTransactions(size, sc);
		System.out.println("\nEnetered transactions as: ");
		DisplayTransactions da = new DisplayTransactions();
		da.display(arr);
		Targets tg = new Targets(arr);
	    sc.close();			
	}

}
