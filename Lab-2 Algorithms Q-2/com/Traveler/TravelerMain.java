package com.Traveler;

import java.util.Scanner;

import com.Traveler.Denominations.Denominations;
import com.Traveler.Display.DisplayDenominations;
import com.Traveler.Process.Payment;


public class TravelerMain {
	static int size;
	static int arr[];
	
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter the total no. of denominations in a currency: ");
		size = sc1.nextInt();
		arr = new int[size];
		Denominations dn = new Denominations();
		arr = dn.denominationsValue(size, sc1);
		
		System.out.println("\nEnetered currency denominations as: ");
		DisplayDenominations dd = new DisplayDenominations();
		dd.display(arr);
		Payment pr = new Payment();
		pr.process(arr);
		
		
		
	}

}
