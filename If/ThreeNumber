import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();

		int middle = 0;

		if (A >= B && A >= C) {

			if (B <= C)
				middle = C;
			else
				middle = B;
		} else if (B >= A && B >= C) {

			if (A <= C)
				middle = C;
			else
				middle = A;
		} else {

			if (A >= B)
				middle = A;
			else
				middle = B;
		}
		System.out.println(middle);
	}
}
