package Arrays_Program;

import java.util.Arrays;

public class Sum_Of_Digonals {
	static void diagonals() {
		int arr[][]= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		int len=arr.length;
		int primaryD=0,secondaryD=0;
		
		for(int i=0;i<len;i++) {
			primaryD=primaryD+arr[i][i];
			secondaryD=secondaryD+arr[i][len-i-1];
		}
		System.out.println("Primary Diagonals   :"+primaryD);
		System.out.println("Secondary Diagonals :"+secondaryD);
		int sum=primaryD+secondaryD;
		
		if(len%2==1) {
			sum=sum-arr[len/2][len/2];
		}
		System.out.println("Sum Of Diagonal's   :"+sum);
	}
	public static void main(String[] args) {
		diagonals();
	}
}
