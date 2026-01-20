package Arrays_Program;

import java.util.Arrays;

public class RemoveDuplicate {

	/*Remove Duplicated Element Of Array*/
	static void show(int arr[]) {
		System.out.println("Show Original Array                   :"+Arrays.toString(arr));
		System.out.print("Show Array In Duplicated Element      :");
		for(int i=0;i<arr.length;i++) {
			int flag=0;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					flag=1;
					System.out.print(arr[i]+" ");
				}
			}
		}
		System.out.print("\nShow Array Without Duplicated Element :");
		for(int i=0;i<arr.length;i++) {
			int flag=0;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					flag=1;
				}
			}if(flag==0) {
				System.out.print(arr[i]+" ");
			}
		}
	}
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,2,4,6,7,8,9,1,10,5,10};  //Duplicated = 1,2,4,5
		show(arr);
	}

}
