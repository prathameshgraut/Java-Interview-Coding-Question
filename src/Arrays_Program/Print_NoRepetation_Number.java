package Arrays_Program;

public class Print_NoRepetation_Number {

	static void print() {
		int arr[]= {9,7,3,1};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				for(int k=0;k<arr.length;k++) {
					for(int l=0;l<arr.length;l++) {
						if(arr[i]!=arr[j] && arr[j]!=arr[k] && arr[k]!=arr[l] && arr[l]!=arr[i] && arr[j]!=arr[l] && arr[k]!=arr[i]) {
							System.out.println(" "+arr[i]+arr[j]+arr[k]+arr[l]);
						}
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		print();
	}

}
