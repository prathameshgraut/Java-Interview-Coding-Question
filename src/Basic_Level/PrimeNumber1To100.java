package Basic_Level;

public class PrimeNumber1To100 {

	static void print() {
		for(int i=0;i<=100;i++) {
			int num=i;
			int flag=0;
			for(int j=2;j<num;j++) {
				if(num%j==0) {
					flag=1;
				}
			}
			if(flag==0) {
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
		print();
	}

}
