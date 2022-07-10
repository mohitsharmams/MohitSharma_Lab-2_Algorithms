package com.PayMoney.Transactions;

import java.util.Scanner;

// Creating transactions array having size as no. of transaction and elements will be amount in Rs.
public class Transactions {

	double arr[];
	
	public double[] dailyTransactions(int size, Scanner sc) {
		arr = new double[size];
		for (int i=0; i<size; i++) {
			System.out.print("Enter amount for transaction "+(i+1)+" in Rs.: ");
			arr[i] = sc.nextDouble();
		}
		return arr;
	}
	

}


