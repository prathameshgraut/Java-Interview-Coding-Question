package Basic_Level;

public class Palindrome {

	static void print(int num) {
		int sum=num;
		int res=0;
		for(int i=0;i<num;i++) {
			res = res + i;
		}
		if(sum==num)
			System.out.println(num+" Is A Palindrome Number");
		else
			System.out.println(num+" Is A Not Palindrome Number");
	}
	public static void main(String[] args) {
		print(153);
	}

}
