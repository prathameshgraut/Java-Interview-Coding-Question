package Arrays_Program;

import java.util.Arrays;
import java.util.Scanner;


/*This Program Are Used To Using User-Input Data*/
public class RemoveDuplicateElement_UserInput {
	static void show() {
		int arr[]=new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A Element:");
		for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
		}
		System.out.println("Show Array :"+Arrays.toString(arr));
		
		System.out.print("Show Duplicated Element :");
		int count=0;
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
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					flag=1;
				}
			}if(flag==0) {
				srr[s]=arr[i];
				s++;
			}
		}
		System.out.println("\nShow After Removing Duplicat Element:"+Arrays.toString(srr));
	}
	public static void main(String[] args) {
		show();
	}
}
