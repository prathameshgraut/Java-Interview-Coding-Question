package Arrays_Program;

import java.util.Arrays;

public class Find_Biggest_OddNumber {

	static void print() {
		int arr[]= {63,30,44,55,11,121,43,54,32,10,9};
		System.out.println("Show Actual Array :"+Arrays.toString(arr));
		int bigOdd=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				System.out.println("Odd Number :"+arr[i]);
				if(arr[i]>bigOdd) {
					bigOdd=arr[i];
				}
			}
		}
		System.out.println("Biggest Odd Number At Present In Array :"+bigOdd);
	}
	
	public static void main(String[] args) {
		print();
	}
}
