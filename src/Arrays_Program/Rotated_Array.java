package Arrays_Program;

import java.util.Arrays;

public class Rotated_Array {
	
	/*Left Rotated  -> First Swap To Last */
	static void Left() {
		System.out.println("Print Left Rotated Array .... !!");
		int left[]= {11,22,33,44,55};
		System.out.println("Show Actual Array :"+Arrays.toString(left));
		int f=left[0];
		
		for(int i=0;i<left.length-1;i++) {
			left[i]=left[i+1];
		}
		
		left[left.length-1]=f;   //Added First Element in Last Position In Array...
		
		System.out.println(Arrays.toString(left));
	}
	
	/*Right Rotated Array -> Last Swap To First*/
	static void Right() {
		System.out.println("\n\nPrint Right Rotated Array .... !!");
		int right[]= {11,22,33,44,55};
		System.out.println("Show Actual Array :"+Arrays.toString(right));
		int l=right[right.length-1];  //stored Last Element 
		
		for(int i=right.length-1;i>0;i--) {
			right[i]=right[i-1];
		}
		
		right[0]=l;  //Added Last Element in First In Array...
		System.out.println(Arrays.toString(right));
	}

	public static void main(String[] args) {
		Left();
		Right();
	}
}
