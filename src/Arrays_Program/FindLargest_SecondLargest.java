package Arrays_Program;

import java.util.Arrays;

public class FindLargest_SecondLargest {
	static void show() {
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
		System.out.println("Largest Number In Array:"+largest+"\nSecond Largest Number In Array:"+SecondLargest);
	}
public static void main(String[] args) {
	show();
}
}
