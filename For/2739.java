import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		for(int i=N;i<=N;i++) {
			for(int j=1;j<=9;j++) {
				System.out.println(i+" * "+j+" = "+i*j);
			}
			System.out.println();
		}
	}
}
