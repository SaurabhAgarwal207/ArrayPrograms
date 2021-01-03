package com.saurabh.arrays;

import java.util.Scanner;

/****************
 * 
 * @author Saurabh Agarwal Program to find missing number of array
 */
public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter array size");
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] arr = new int[size - 1];
		System.out.println("Please enter array element , as a condition you will have to enter one less element");
		for (int i = 0; i < size - 1; i++)
			arr[i] = scan.nextInt();
		int sum = (size * (size + 1)) / 2;
		int sum1 = 0;
		for (int i = 0; i < arr.length; i++)
			sum1 += arr[i];
		System.out.println("Missing element is :" + (sum - sum1));
		scan.close();
	}

}
