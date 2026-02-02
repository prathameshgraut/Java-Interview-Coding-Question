package Arrays_Program;

public class First_RepeatingElement {

	static void show() {
		int arr[]= {1,2,3,4,5,4,5,6,7,3};
		
		for(int i=0;i<arr.length;i++) {
			int num=arr[i];
			for(int j=i+1;j<arr.length;j++) {
				if(num==arr[j]) {
					System.out.println(arr[i]);
					return;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		show();
	}

}
