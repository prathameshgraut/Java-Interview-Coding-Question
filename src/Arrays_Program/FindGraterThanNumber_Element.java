package Arrays_Program;

import java.util.Arrays;
import java.util.Scanner;

public class FindGraterThanNumber_Element {
	static void display() {
		int arr[]= {10,20,30,40,50,60,70,80,90,100};
		System.out.println("Show Array :"+Arrays.toString(arr));
		int num;
		Scanner Sc = new Scanner(System.in);
		System.out.print("Enter A Number :");
		num=Sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=num) {
				System.out.print(arr[i]+" ");
			}
		}
	}
	
public static void main(String[] args) {
	display();
}
}
