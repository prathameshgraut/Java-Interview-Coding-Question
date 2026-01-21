package Arrays_Program;

import java.util.Arrays;

public class SwapArray {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		int srr[]= {60,70,80,90,100};
		System.out.println("Show , Before Swapping Array...."+"\nPrint Arr Array:"+Arrays.toString(arr)+"\nPrint Srr Array:"+Arrays.toString(srr));
		int temp[]= new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			temp[i]=arr[i];
		}
		
		for(int i=0;i<srr.length;i++) {
			arr[i]=srr[i];
		}
		
		for(int i=0;i<temp.length;i++) {
			srr[i]=temp[i];
		}
		System.out.println("\nShow , After Swapping Array...."+"\nPrint Arr Array:"+Arrays.toString(arr)+"\nPrint Srr Array:"+Arrays.toString(srr));
	}
	
}
