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
	
	public static void main(String[] args) {
		print();
	}
}
