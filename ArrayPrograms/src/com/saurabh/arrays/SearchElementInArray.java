package com.saurabh.arrays;

import java.util.Scanner;

public class SearchElementInArray {

	static public boolean searchElement(int[] arr, int ele) {
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ele)
				flag = true;
		}

		return flag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter Array size");
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int arr[] = new int[size];
		System.out.println("Please enter array elements");
		for (int i = 0; i < size; i++)
			arr[i] = scan.nextInt();
		System.out.println("Enter elemnt to be searched");
		int ele = scan.nextInt();
		boolean flag = searchElement(arr, ele);
		if (flag == true)
			System.out.println("Elemnt is present in Array");
		else
			System.out.println("Element not present in array");
		scan.close();
	}

}
