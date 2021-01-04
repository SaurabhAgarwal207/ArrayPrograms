package com.saurabh.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please eneter array size");
		Scanner scan = new Scanner(System.in);
		int size= scan.nextInt();
		System.out.println("Please enter array elements");
		int[] arr= new int[size];
		for(int i=0;i<size;i++)
			arr[i] = scan.nextInt();
		Arrays.sort(arr);
		System.out.println("Smallest element is :" + arr[0]);
	}

}
