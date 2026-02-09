package Pattern_Program;

public class Sum_Of_number {

	public static void main(String[] args) {
		int num=555;
		int res=0,add;
		while(num>0) {
			add=num%10;
			res=res+add;
			num=num/10;
		}
		System.out.println(res);
	}

}
