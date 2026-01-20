package Arrays_Program;

import java.util.Arrays;
import java.util.Scanner;

public class String_RemovingRepeatedString {
	static void display() {
		String srr[] = new String[10];
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Text To Stored In Array :");
		for (int i = 0; i < srr.length; i++) {
			srr[i] = sc.next(); // Stored String Value
		}
		System.out.println("Show String Array :" + Arrays.toString(srr));
		
		System.out.print("Show Repeated Text :");
		int count=0;
		for(int i=0;i<srr.length;i++) {
			for(int j=i+1;j<srr.length;j++) {
				if(srr[i].equals(srr[j])) {
					System.out.print(srr[i]+" ");
					count++;
				}
			}
		}

		String store[]=new String[srr.length-count];
		int k=0;
		for(int i=0;i<srr.length;i++) {
			int flag=0;
			for(int j=i+1;j<srr.length;j++) {
				if(srr[i].equals(srr[j])) {
					flag=1;
				}
			}if(flag==0) {
				store[k]=srr[i];
				k++;
			}
		}
		System.out.println("\nShow After Removing Repeated Text :"+Arrays.toString(store));
	}

	public static void main(String[] args) {
		display();
	}
}
