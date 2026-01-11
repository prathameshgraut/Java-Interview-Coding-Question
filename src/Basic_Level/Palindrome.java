package Basic_Level;

public class Palindrome {

	static void print(int num) {
		int sum=num;
		int res=0,add;
		while(num>0) {
			add= num%10;
			res=res*10+add;
			num=num/10;
		}
		if(sum==res)
			System.out.println(res+" Is A Palindrome Number");
		else
			System.out.println(sum+" Is A Not Palindrome Number");
	}
	public static void main(String[] args) {
		print(151);
	}

}
