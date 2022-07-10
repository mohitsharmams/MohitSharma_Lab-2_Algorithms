package com.Traveler.Process;

import java.util.Scanner;

import com.Traveler.SortArray.MergeSort;

public class Payment {
	
    int[] arr;
	int targetAmount = 0;
	int checkAmount = 0;
	int currentValue1 = 0;
	boolean status = false;

	public void process(int[] arr) {
		
		MergeSort ms = new MergeSort();		
		this.arr = ms.sort(arr, 2); // Sorting in descending order
		int size = arr.length;

		Scanner sc2 = new Scanner(System.in);
				
			System.out.print("Enter amount to pay : ");
			targetAmount = sc2.nextInt();
			int tempAmount = targetAmount;
			
			// Loop for checking the condition that if any amount will not be completely divisible then it is invalid
			for(int i=0; i<size; i++) {
				if(tempAmount % this.arr[i]==0) {  
					status = true;
				}
			}
			
			if(status){
				for(int i=0 ; i<size ; i++) {
				
					currentValue1 = 0;
					if(tempAmount >= this.arr[i]) {					
						do{						
							currentValue1++;
							checkAmount = checkAmount+ this.arr[i];
							tempAmount = tempAmount-this.arr[i];						
						}while(tempAmount >= this.arr[i]);	
					
						System.out.println("Denomination> "+this.arr[i]+" x "+currentValue1+" = "+(this.arr[i]*currentValue1));					
					}
				
					else if(checkAmount == targetAmount) {
						break;
					}	

				}
			}
			
			if(checkAmount != targetAmount || !status) {  // handling input 0 as well
				System.err.println("\nCan not pay the amount in current denominations\n");
			}

		System.out.println("\nAnalysis finished\nExiting the program!");
		sc2.close();
		
	}

}
