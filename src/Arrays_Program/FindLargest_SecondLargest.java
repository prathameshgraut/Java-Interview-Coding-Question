package Arrays_Program;

import java.util.Arrays;
import java.util.Scanner;

public class FindLargest_SecondLargest {
	
	//1--->
	static void show() {
		System.out.println("....Calling A Simple Method....");
		int arr[]= {10,21,32,44,67,98,75,12,5,73};
		int largest=0,SecondLargest=0;
		System.out.println("Show Original Array:"+Arrays.toString(arr));
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				SecondLargest=largest;
				largest=arr[i];
			}else if(arr[i]>SecondLargest) {
				SecondLargest=arr[i];
			}
		}
		System.out.println("Largest Number In Array : "+largest+"\nSecond Largest Number In Array : "+SecondLargest);
	}
	
	//2-->
	static void Show() {
		System.out.println("\n\n....Calling A User Define Method....");
		int arr[]= new int[10];
		System.out.print("Enter Element To Stored In Array:");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int largest=0,SecondLargest=0;
		System.out.println("Show Original Array:"+Arrays.toString(arr));
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				SecondLargest=largest;
				largest=arr[i];
			}else if(arr[i]>SecondLargest) {
				SecondLargest=arr[i];
			}
		}
		System.out.println("Largest Number In Array : "+largest+"\nSecond Largest Number In Array : "+SecondLargest);
	}
	
	//33-->
		static void SHOW(int arr[],int largest,int SecondLargest) {
			System.out.println("\n\n....Calling A Parameterized Method....");
			System.out.println("Show Original Array:"+Arrays.toString(arr));
			for(int i=0;i<arr.length;i++) {
				if(arr[i]>largest) {
					SecondLargest=largest;
					largest=arr[i];
				}else if(arr[i]>SecondLargest) {
					SecondLargest=arr[i];
				}
			}
			System.out.println("Largest Number In Array : "+largest+"\nSecond Largest Number In Array : "+SecondLargest);
		}
public static void main(String[] args) {
	show(); //1.Using Hard Coded Data
	Show(); //2.Using User-Input Data
	
	int arr[]= {10, 21, 32, 44, 67, 98, 75, 12, 5, 73};
	int largest=0,SecondLargest=0;
	SHOW(arr,largest,SecondLargest); //3.Using Parameterized Function
}
}
