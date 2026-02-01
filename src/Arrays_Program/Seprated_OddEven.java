package Arrays_Program;

import java.util.Arrays;

public class Seprated_OddEven {
	static void print() {
		int arr[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		System.out.println("Show Originle Array :"+Arrays.toString(arr));
		
		int oCount=0,eCount=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				eCount++;
		}else {
				oCount++;
			}
		}
		int Even[]=new int[arr.length-eCount];
		int Odd[]=new int[arr.length-oCount];
		int e=0,o=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				Even[e]=arr[i];
				e++;
		}else {
			Odd[o]=arr[i];
			o++;
			}
		}
		
		System.out.println("Even Number Array    :"+Arrays.toString(Even));
		System.out.println("Odd number Array     :"+Arrays.toString(Odd));
	}
public static void main(String[] args) {
	print();
}
}
