package Arrays_Program;

import java.util.Arrays;

public class MoveAllZero_Starting {
	
	static void print() {
		int arr[]= {1,3,4,0,7,5,0,9,0};
		int k=arr.length-1;
		
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]!=0) {
				arr[k]=arr[i];
				k--;
			}
		}while(k>=0) {
			arr[k]=0;
			k--;
		}
		System.out.println(Arrays.toString(arr));
	}
	
public static void main(String[] args) {
	print();
}
}
