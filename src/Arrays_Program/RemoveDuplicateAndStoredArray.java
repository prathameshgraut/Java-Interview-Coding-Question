package Arrays_Program;

import java.util.Arrays;

/*This Program To Performed Sorting Duplicated Element And Stored In After Array In Another Array*/
public class RemoveDuplicateAndStoredArray {
	static void show() {
		int arr[]= {1, 2, 3, 4, 5, 2, 4, 6, 7, 8, 9, 1, 10, 5, 10};
		
		int count=0;
		
		System.out.println("Show Original Array :"+Arrays.toString(arr));
		System.out.print("Show Duplicated Element :");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					System.out.print(arr[i]+" ");
				}
			}
		}
		int srr[]=new int[arr.length-count];
		int s=0;
		for(int i=0;i<arr.length;i++) {
			int flag=0;
			for(int j =i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					flag=1;
				}
			}if(flag==0) {
				srr[s]=arr[i];
				s++;
			}
		}
		System.out.println("\nShow Array An Without Duplicating Element :"+Arrays.toString(srr));
	}
public static void main(String[] args) {
	show();
}
}
