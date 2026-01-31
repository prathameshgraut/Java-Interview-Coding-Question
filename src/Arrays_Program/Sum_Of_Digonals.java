package Arrays_Program;

public class Sum_Of_Digonals {
	public static void main(String[] args) {
		int arr[][]={
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		int len=arr.length;
		int primaryDiagonals=0;
		int secondaryDiagonal=0;
		
		for(int i=0;i<len;i++) {
			primaryDiagonals=primaryDiagonals+arr[i][i];
			secondaryDiagonal=secondaryDiagonal+arr[i][len-i-1];
		}
		System.out.println("Primary Diagonal's :"+primaryDiagonals+"\nSecondary Diagonal's :"+secondaryDiagonal);
		int sum=primaryDiagonals+secondaryDiagonal;
		if(len%2==1) {
			sum=sum-arr[len/2][len/2];
		}
		System.out.println("Sum Of Diagonal's :"+sum);
	}
}
