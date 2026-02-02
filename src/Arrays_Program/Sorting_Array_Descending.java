package Arrays_Program;

import java.util.Arrays;

public class Sorting_Array_Descending {

	static void show() {
		int arr[]= {12,32,10,5,90,30,27,65,11};
		System.out.println("Before Descending Order :"+Arrays.toString(arr));

		for(int i=0;i<arr.length;i++) {
			int temp=0;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		System.out.println("After Descending Order  :"+Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		show();
	}

}
