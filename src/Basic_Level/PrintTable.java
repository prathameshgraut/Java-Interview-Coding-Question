package Basic_Level;

import java.util.Scanner;

public class PrintTable {

	/*User Define method To Print Table Of Number*/
	static void table(int num) {
		int res=1;
		for(int i=1;i<=10;i++) {
			res=num*i;
			System.out.println(num+" x "+i+" = "+res );
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A Number To Print Table =");
		int num;
		num=sc.nextInt();
		table(num);
	}

}
