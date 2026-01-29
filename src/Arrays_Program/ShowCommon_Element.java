package Arrays_Program;

import java.util.Arrays;

public class ShowCommon_Element {
	
	static void print() {
		int arr[]= {11,21,31,11,41,31,51};
		System.out.print("Show Original Array :"+Arrays.toString(arr)+"\nPrint Common Element In Array :");
		for(int i=0;i<arr.length;i++) {
			int num=arr[i];
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.print(arr[i]+" ");
				}
			}
		}
	}
	
public static void main(String[] args) {
	print();
}
}
