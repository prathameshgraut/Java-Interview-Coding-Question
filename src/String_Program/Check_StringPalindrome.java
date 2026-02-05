package String_Program;

import java.util.Scanner;

public class Check_StringPalindrome {

	private void Show() {
		System.out.println("Function No.1,\nThis Function Handle Hard-Coded Data...!");
		String str="madam";
		System.out.println("Actual String :"+str);
		String Stored=str;
		String res="";
		for(int i=str.length()-1;i>=0;i--) {
			res=res+str.charAt(i);
		}
		if(Stored.equals(res)) {
			System.out.println("✅String Palindrome :"+res);
		}else {
			System.out.println("❎String Not Palindrome :"+res);
		}
	}
	
	private void Show2(String str) {
		System.out.println("\n\nFunction No.2,\nThis Function Handle Argument's...!");
		System.out.println("Actual String :"+str);
		String Stored=str;
		String res="";
		for(int i=str.length()-1;i>=0;i--) {
			res=res+str.charAt(i);
		}
		if(Stored.equals(res)) {
			System.out.println("✅String Palindrome :"+res);
		}else {
			System.out.println("❎String Not Palindrome :"+res);
		}
	}
	
	private void Show3() {
		System.out.println("\n\nFunction No.3,\nThis Function Handle User-Input Data...!");
		String str="";
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A String :");
		str=sc.next();
		System.out.println("Actual String :"+str);
		String Stored=str;
		String res="";
		for(int i=str.length()-1;i>=0;i--) {
			res=res+str.charAt(i);
		}
		if(Stored.equals(res)) {
			System.out.println("✅String Palindrome :"+res);
		}else {
			System.out.println("❎String Not Palindrome :"+res);
		}
	}
	
	public static void main(String[] args) {
		Check_StringPalindrome CSP = new Check_StringPalindrome();
		
		CSP.Show();
		
		String str="Pune";
		CSP.Show2(str);
		
		CSP.Show3();
	}

}
