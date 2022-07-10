package com.PayMoney.Targets;

import java.util.Scanner;

public class Targets {
	boolean status = true;
	int count=0;
	int transactions=0;
	double[] arr;
	int size;
	
	public Targets(double[] arr) {
		
		this.arr = arr;
		size = arr.length;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("Enter the total no. of targets");
			transactions = sc.nextInt();
			if((transactions > size || transactions < 0) && (count < 3)) {
				count++;
				status = true;		
			}
			else {
				status = false;
			}
			
		}while (status && count < 3);
		
		if(count>=3) {
			System.err.println("Wrong inputs 3 times, program is exiting!");
			sc.close();
			return;
		}
		
		count=0;
		
		while(count<transactions) {
			count++;
			double targetAmount = 0;
			double checkAmount = 0;
			int noOfTransactions = 0;
		
			System.out.print("Enter amount in Rs. for target no.-"+count+" : ");
			targetAmount = sc.nextDouble();
			
			for(int i=0 ; i<size ; i++) {
				noOfTransactions++;
				checkAmount += arr[i];
				if(checkAmount >= targetAmount) {
					System.out.println("Target achived after "+noOfTransactions+" Transactions\n");
					break;
				}
			}
			if(checkAmount<= targetAmount) {
				System.out.println("Target not achieved\n\n");
			}

		}
		System.out.println("Analysis finished\nExiting the program!");
		sc.close();
	}

}
