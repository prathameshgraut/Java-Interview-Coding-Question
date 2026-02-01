package Arrays_Program;

public class Find_Missing_Element {
	
	/*This Method Are Print Single Missing Element*/
	private static void Single_Missing(int arr[]) {
		System.out.println("Show Single Missing Element,");
		int missing=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=i+1) {
				missing = i+1;
				break;
			}
		}
		System.out.println("Show Missing Number :"+missing);
	}
	
	/*This Method Show All Missing Number*/
	private static void Multiple_Missing(int arr[]) {
		System.out.println("\n\nShow Multiple Missing Element,");
		int missing=1;
		int i=0;
		while(arr[i]<=arr[arr.length-1]) {
			if(arr[i]==missing) {
				i++;
			}else {
				System.out.print(missing+" ");
			}
			missing++;
		}
	}
public static void main(String[] args) {
	int arr[]= {1,2,3,5,8,10,13,15,18,20};
	Single_Missing(arr);
	Multiple_Missing(arr);
}
}
