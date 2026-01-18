package Arrays_Program;

import java.util.Arrays;

public class FindPrimeNumber {
	
	static void Print() {
		System.out.print("Show Of Array :");
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		int count=0;
		System.out.println(Arrays.toString(arr));
		
		System.out.print("Show All Prime Number :");
		for(int i=0;i<arr.length;i++) {
			int num=i;
			int flag=0;
			for(int j=2;j<num;j++) {
				if(num%j==0) {
					flag=1;
				}
			}if(flag==0) {
				System.out.print(num+" ");
				count++;
			}
		}
		System.out.print("\nTotal Prime Number : "+count);
	}
	
	public static void main(String[] args) {
		Print();
	}
}
