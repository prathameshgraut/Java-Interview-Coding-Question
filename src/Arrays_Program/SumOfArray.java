package Arrays_Program;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfArray {
	
	//1.This Is Method Using Hard Coded Data & Calculated Of Array
	static void sum1() {
		int arr[]= {1,2,3,4,5};
		int sum=0;
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++)
			sum=sum+arr[i];
		System.out.println("Sum Of Array :"+sum);
	}
	
	//2.This Is Parameterized Method  
	static void sum2(int arr[]) {
		System.out.println(Arrays.toString(arr));
		int total=0;
		for(int i=0;i<arr.length;i++)
			total=total+arr[i];
		System.out.println("Sum Of Array :"+total);
	}
	
	//3.This Method Handle User-Input Data & Calculated Of Array
	static void sum3() {
		int arr[]=new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A Value To Stored In Array :");
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		System.out.println(Arrays.toString(arr));
		int sum=0;
		for(int i=0;i<arr.length;i++)
			sum=sum+arr[i];
		System.out.println("Sum Of Array :"+sum);
	}
	
public static void main(String[] args) {
	sum1();
	System.out.println("*******************************************************");
	int arr[]= {1,2,3,4,5};
	sum2(arr);
	System.out.println("*******************************************************");
	sum3();
}
}
