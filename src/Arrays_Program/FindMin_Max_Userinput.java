package Arrays_Program;

import java.util.Arrays;
import java.util.Scanner;


/*This Is Used To Print Minimum & Maximum Number In Array But Using A User-input Data*/
public class FindMin_Max_Userinput {
	
	static void Show(int arr[],int min , int max) {
		System.out.println("Show Array :"+Arrays.toString(arr));
		for(int i=0;i<arr.length;i++) {
			int num=arr[i];
			if(num<min) {
				max=min;
				min=arr[i];
			}else if(num>max) {
				max=arr[i];
			}
		}
		System.out.println("Minimum Number Of Array :"+min);
		System.out.println("Maximum Number Of Array :"+max);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[]=new int[10];
		System.out.print("Enter A Value To Stored In Arrray :");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int min=arr[0],max=arr[0];
		Show(arr,min,max);
	}
}
