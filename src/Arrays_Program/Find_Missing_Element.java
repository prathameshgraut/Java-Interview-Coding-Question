package Arrays_Program;

public class Find_Missing_Element {
	
	/*This Method Are Print Single Missing Element*/
	static void Single_Missing() {
		int arr[]= {1,2,3,5};
		int Missing_Element=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=i+1) {
				Missing_Element=i+1;
			}
		}
		System.out.println("Show Missing Number :"+Missing_Element);
	}
	
	
	/*This Method Are Show All Missing Element*/
	static void Multiple_Missing() {
		int arr[]= {11,12,14,15};
		int Missing_Element=1;
		int i=0;
		
		while(arr[i]<=arr[arr.length-1]) {
			if(arr[i]==Missing_Element) {
				i++;
			}else {
				System.out.print(Missing_Element+" ");
			}
			Missing_Element++;
		}
	}
	
public static void main(String[] args) {
	Single_Missing();
	Multiple_Missing();
}
}
