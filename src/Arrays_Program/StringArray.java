package Arrays_Program;

import java.util.Arrays;
import java.util.Scanner;

public class StringArray {
	
	private void display() {
		String srr[]=new String[10];
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Text To Stored In Array :");
		for(int i=0;i<srr.length;i++) {
			srr[i]=sc.next();                    //Stored String Value
		}
		System.out.println("Show String Array :"+Arrays.toString(srr));
	}
	
public static void main(String[] args) {
	StringArray sa= new StringArray();
	sa.display();
}
}
