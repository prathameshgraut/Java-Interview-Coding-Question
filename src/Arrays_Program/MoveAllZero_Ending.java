package Arrays_Program;

import java.util.Arrays;

public class MoveAllZero_Ending {
	
	static void print() {
		int arr[]= {1,3,4,0,7,0,5,9,0};
		System.out.println("Show Actual Array              :"+Arrays.toString(arr));
		int k=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				arr[k]=arr[i];
				k++;
			}
		}while(k<arr.length) {
			arr[k]=0;
			k++;
		}
		System.out.println("Show After Swaping Zero Ending :"+Arrays.toString(arr));
	}
public static void main(String[] args) {
	print();
}
}
