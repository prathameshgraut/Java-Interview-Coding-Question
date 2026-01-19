package Arrays_Program;

import java.util.Arrays;

/*Reverse Array In Simple Way....*/
public class ReverseArray {
	
	static void print() {
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		System.out.println("Print Original Array :"+Arrays.toString(arr));
		
		//Print Reverse Array Using For Loop
		System.out.print("Print Reverse Array  :[");
		 for(int i=arr.length-1;i>=0;i--)
			 System.out.print(arr[i]+", ");
		 System.out.print("]");
	}
	
	/*Print Reverse Array using Another Array( Stored Reverse Array In Another Array)*/
	static void print1() {
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		int srr[]=new int[arr.length];
		int j=0;
		
		System.out.println("\n\nPrint Original Array:"+Arrays.toString(arr));
		for(int i=arr.length-1;i>=0;i--) {
			srr[j]=arr[i];
			j++;
		}
		System.out.println("Print Reverse Array:"+Arrays.toString(srr));
	}
	public static void main(String[] args) {
		print();
		print1();
	}
}
