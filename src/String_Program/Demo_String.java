package String_Program;

public class Demo_String {

	public static void main(String[] args) {
		/*This Is A Simple Code Of String Pattern*/
		String str="Hello I'm Simple String Code";    //Stored String Value
		System.out.println(str);
		
		String str2="Java...";
		String str3=str.concat(" "+str2);
		System.out.println(str3);
		
		String str4="Prathamesh";
		System.out.println(str4.substring(0,5));      //0 Is Starting Of String & 5 Is Ending Of String
	}

}
