package Basic_Level;

import java.util.Scanner;

public class CheckWheather {

	static void wheather() {
		Scanner sc =  new Scanner(System.in);
		int temp;
		System.out.print("Enter A Wheather =");
		temp=sc.nextInt();
		
		if(temp>50)
			System.out.println("Hot Tempreture ....");
		else if(temp>=20)
			System.out.println("Medium Tempreture ....");
		else
			System.out.println("Cool Tempreture ....");
	}
	
	public static void main(String[] args) {
		wheather();
	}

}
