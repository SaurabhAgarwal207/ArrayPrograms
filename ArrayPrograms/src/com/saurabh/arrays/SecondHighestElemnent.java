package com.saurabh.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class SecondHighestElemnent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please eneter array size");
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		System.out.println("Please enter array elements");
		int[] arr = new int[size];
		for (int i = 0; i < size; i++)
			arr[i] = scan.nextInt();
		int fh = 0; // Integer.MIN_VALUE;
		int sh = 0;// Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > fh)
				fh = arr[i];
			else if (arr[i] > sh && arr[i] != fh)
				sh = arr[i];
		}
		System.out.println(sh);
		scan.close();
	}

}
