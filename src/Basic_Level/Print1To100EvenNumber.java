package Basic_Level;

public class Print1To100EvenNumber {
	public void print(int s,int e) {
		System.out.println("Print Only Even Number,");
		for(int i=s;i<=e;i++) {
			if(i%2==0)
				System.out.print(i+" ");
		}
	}
	public static void main(String[] args) {
		Print1To100EvenNumber p1 = new Print1To100EvenNumber();
		p1.print(1,100);
	}
}
