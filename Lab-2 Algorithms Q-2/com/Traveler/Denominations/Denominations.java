package com.Traveler.Denominations;

import java.util.Scanner;

//Creating transactions array having size as no. of transaction and elements will be amount in Rs.
public class Denominations {

	int arr[];
	
	public int[] denominationsValue(int size, Scanner sc) {
		arr = new int[size];
		for (int i=0; i<size; i++) {
			System.out.print("Enter Denomination "+(i+1)+" value: ");
			arr[i] = sc.nextInt();
		}
		return arr;
	}
	

}
