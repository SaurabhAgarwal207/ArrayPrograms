package com.saurabh.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestLargetElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter array size");
		int size= scan.nextInt();
		int[] arr = new int[size];
		System.out.println("Please enter Array elements");
		for(int i=0;i<size;i++)
		{
			arr[i]=scan.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("Smallest Element is :" + arr[0]+ " and Largest element is :"+ arr[size-1]);
		scan.close();
	}

}
