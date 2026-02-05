package String_Program;

import java.util.*;

public class Find_VowelsANDPrint__Symbol {

	
	//This is Solve Vowels Using Hard Coded String
	public void Print() {
		String str="Stranger";
		String res="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				res=res+"@";
			}else {
				res=res+ch;
			}
		}
		System.out.println("Using Symbol In Every Vowel's :"+res);
	}
	
	
	//This is Solve A Vowel's Issue Using Passing Parameter's In Function
	public void Print1(String str) {
		String res="";
		for(int n =0;n<str.length();n++) {
			char ch=str.charAt(n);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				res=res+"@";
			}else {
				res=res+ch;
			}
		}
		System.out.println("Using Symbol In Every Vowel's :"+res);
	}
	
	
	//This is Function To Solve A Vowel's Issue Using User-Input Data
	public void Print2() {
		String str="";
		Scanner Sc = new Scanner(System.in);
		System.out.print("Enter A String :");
		str=Sc.next();
		String res="";
		for(int n =0;n<str.length();n++) {
			char ch=str.charAt(n);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				res=res+"@";
			}else {
				res=res+ch;
			}
		}
		System.out.println("Using Symbol In Every Vowel's :"+res);
	}
public static void main(String[] args) {
	Find_VowelsANDPrint__Symbol fvs= new Find_VowelsANDPrint__Symbol();
	
	fvs.Print();
	
	String str="Maharashtra";
	fvs.Print1(str);
}
}
