package ADVANCED_OOP_JDBC_PROGRAMS;

public class Check_Palindrome_Using_Boolean {
	
	static void Print() {
		int num=101;
		int store=num;
		boolean value=false;
		int add,res=0;
		while(num>0) {
			add=num%10;
			res=res*10+add;
			num=num/10;
		}
		if(res==store) {
			value=true;
		}else {
			value=false;
		}
		System.out.println(value);
	}
	
	public static void main(String[] args) {
		Print();
	}
}
