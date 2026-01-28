package Arrays_Program;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwo_Array {
	private static void display() {
	int arr[]= {1,2,3,4,5};
	int srr[]= {6,7,8,9,10};
	int merge[]=new int[arr.length+srr.length];
	
	System.out.println("Print Before Merging Array \nFirst Array :"+Arrays.toString(arr)+"\nSecond Array:"+Arrays.toString(srr));
	
	for(int i=0;i<arr.length;i++) {
		merge[i]=arr[i];
	}
	for(int i=0;i<srr.length;i++) {
		merge[arr.length+i]=srr[i];
	}
	System.out.println("\n\nPrint After Merging Array (First + Second Array) : "+Arrays.toString(merge));
	}
	
	static void user() {
		System.out.println("\n\nThis Method Are Using User Input...");
		Scanner sc = new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("Enetr A Data To Stored In First Array:");
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		System.out.println("Show Data in First Array :"+Arrays.toString(arr));
		
		int srr[]=new int[5];
		System.out.println("Enter A Data To Stored In Second Array:");
		for(int i=0;i<arr.length;i++)
			srr[i]=sc.nextInt();
		System.out.println("Show Data in Second Array :"+Arrays.toString(srr));
		
		System.out.println("Show Array Before Merging :"+"\nFirst Array :"+Arrays.toString(arr)+"\nSecond Array :"+Arrays.toString(srr));
		
		int mer[]=new int [arr.length+srr.length];
		
		for(int i=0;i<arr.length;i++) {
			mer[i]=arr[i];
		}
		for(int i=0;i<srr.length;i++) {
			mer[arr.length+i]=srr[i];
		}
		
		System.out.println("\nAfter Merging Array :"+Arrays.toString(mer));
	}
	
	public static void main(String[] args) {
		display();
		user();
	}
}
