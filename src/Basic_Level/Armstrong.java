package Basic_Level;

import java.util.Scanner;

public class Armstrong {

	
	/*This Method Using Hard Coded Data*/
	static void print(int num) {
		int sum=num;
		int res=0,add;
		while(num>0) {
			add=num%10;
			res=res+add*add*add;
			num=num/10;
		}
		if(sum==res)
			System.out.println(res+" It's Armstrong Number");
		else
			System.out.println(sum+" It's Not Armstrong Number");
	}
	
	
	/*Using User-Input Data*/
	static void show() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A Number = ");
		int num,sum,add,res=0;
		num=sc.nextInt();
		sum=num;
		while(num>0) {
			add=num%10;
			res=res+add*add*add;
			num=num/10;
		}
		if(sum==res)
			System.out.println(res+" It's Armstrong Number");
		else
			System.out.println(sum+" It's Not Armstrong Number");
	}
	public static void main(String[] args) {
		print(153);
		show();
	}
}
