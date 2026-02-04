package Arrays_Program;

import java.util.*;

public class Average_Number_OFArray {
	
	 void look() {
		 System.out.println("Print Average Number Of Array....!");
		 
		 /*Using User Input To Stored In Array*/
		 int arr[]=new int[5];
		 Scanner px = new Scanner(System.in);
		 System.out.print("Enter A Value :");
		 for(int i=0;i<arr.length;i++) {
			 arr[i]=px.nextInt();
		 }
		 System.out.println("Show Array :"+Arrays.toString(arr));
		 
		 int avg=0;
		 for(int j=0;j<arr.length;j++) {
			 avg=avg+arr[j];
		 }
		 System.out.println("Average Numbers Of Array :"+avg);  //Counting All Element In array And Print Average Number In Preset At Array
	 }
	
public static void main(String[] args) {
	Average_Number_OFArray ANA = new Average_Number_OFArray();
	
	ANA.look();
}
}
