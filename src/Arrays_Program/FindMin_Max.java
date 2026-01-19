package Arrays_Program;

import java.util.Arrays;

public class FindMin_Max {
	
	public void show() {
		int arr[]= {54,44,10,11,33,24,56,80,78,12};   //min-10 & max-80
		System.out.println("Show Array :"+Arrays.toString(arr));
		int min=arr[0],max=0;
		
		for(int i=0;i<arr.length;i++) {
			int num=arr[i];
			if(num<min) {
				max=min;
				min=arr[i];
			}else if(num>max) {
				max=arr[i];
			}
		}
		System.out.println("Minimum Value :"+min);
		System.out.println("Maximum Value :"+max);
	}
	
	public static void main(String[] args) {
		FindMin_Max fm= new FindMin_Max();
		fm.show();
	}
}
