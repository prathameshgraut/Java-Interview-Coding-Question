package Basic_Level;

import java.util.Scanner;

public class LeapYear {
	static void year(int year) {
		if(year % 4 == 0 || year % 400==0) {
			System.out.println(year+" It's Leap Year");
		}else {
			System.out.println(year+" It's Not Leap Year");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year;
		System.out.print("Enter A Year : ");
		year = sc.nextInt();
		year(year);
	}

}
