package Arrays_Program;

import java.util.Arrays;

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
	
	public static void main(String[] args) {
		display();
	}
}
