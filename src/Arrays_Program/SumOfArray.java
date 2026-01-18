package Arrays_Program;

public class SumOfArray {
	
	static void sum(int arr[]) {
		int total=0;
		for(int i=0;i<arr.length;i++)
			total=total+arr[i];
		System.out.println("Sum Of Array :"+total);
	}
	
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5};
	sum(arr);
}
}
