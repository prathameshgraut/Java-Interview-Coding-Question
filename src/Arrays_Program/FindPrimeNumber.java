package Arrays_Program;

import java.util.Arrays;
import java.util.Scanner;

public class FindPrimeNumber {
	
	static void Print() {
		System.out.print("Show Of Array :");
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		int count=0;
		System.out.println(Arrays.toString(arr));
		
		System.out.print("Show All Prime Number :");
		for(int i=0;i<arr.length;i++) {
			int num=arr[i];
			int flag=0;
			for(int j=2;j<num;j++) {
				if(num%j==0) {
					flag=1;
				}
			}if(flag==0) {
				System.out.print(num+" ");
				count++;
			}
		}
		System.out.print("\nTotal Prime Number : "+count);
	}
	
	
	//User-Input Method
	static void print() {
		int arr[]=new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.print("\n\nEnter A Value To Stored in Array :");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Show Of Array :"+Arrays.toString(arr));
		
		int count=0;
		System.out.print("Show All Prime Number :");
		for(int i=0;i<arr.length;i++) {
			int num=arr[i];
			int flag=0;
			for(int j=2;j<i;j++) {
				if(num%j==0) {
					flag=1;
				}
			}if(flag==0) {
				count++;
				System.out.print(num+" ");
			}
		}
		System.out.println("\nTotal Prime Number :"+count);
	}
	
	public static void main(String[] args) {
		Print(); //This Method To Show All Array , Show Prime Number , Total Prime Number.
		print(); //This Method Are Same Process but Using User-input Value to Stored Array.
	}
}
