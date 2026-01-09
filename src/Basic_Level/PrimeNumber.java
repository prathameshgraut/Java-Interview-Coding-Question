package Basic_Level;

public class PrimeNumber {

	/* This Method Check A Prime Or Not Prime Number Using Hard Coded Data */
	static void print(int num) {
		int count = 0;
		for (int k = 2; k < num; k++)
			if (num % k == 0)
				count++;
		if (count == 0)
			System.out.println(num+ " is Prime Number");
		else
			System.out.println(num+" is Not Prime Numnber");
	}

	/* This Method Are Print 1 to 100 Prime Number */
	static void show() {
		System.out.println("Print 1 to 100 Prime Number :");
		for (int i = 0; i < 100; i++) {
			int num = i;
			int count = 0;
			for (int j = 2; j < num; j++) {
				if (num % j == 0) {
					count++;
				}
			}
			if (count == 0)
				System.out.println(i);
		}
	}

	public static void main(String[] args) {
		print(14);
		show();
	}
}
