package Basic_Level;

public class SumOfNum {

	public static void main(String[] args) {
		
		int num=555;
		int res=0,add;
		
		while(num>0) {
			add=num%10;        //Give Last Digit (Remainder)
			res=res+add;
			num=num/10;        //Gives quotient(Answer)
		}
		System.out.println(res);

	}

}
