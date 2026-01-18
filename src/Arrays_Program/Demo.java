package Arrays_Program;

import java.util.Arrays;

public class Demo {
	
	static void Print() {
		int arr[]= new int [5];  // Declaring Size Of Array in Memory.
		
		/*Implementation Value in Array*/
		arr [0]=10;
		arr [1]=20;
		arr [2]=30;
		arr [3]=40;
		arr [4]=50;
		
		/*This is For Loop Using To Print All Data In Array...*/
		System.out.print("Show All Data Using For-Loop : ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		
		/*This Line Used To Print All Data In Array(Using A Function To Use And Get All Data)*/
		System.out.print("\n\nShow All Array Using Arrays.toString() Function :");
		System.out.print(Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		Print();
	}
}
