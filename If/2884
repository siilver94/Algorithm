import java.util.Scanner;

public class Alarm {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
while(true) {
		int H = scan.nextInt();
		int M = scan.nextInt();

		if(M<45) {
			M+=15;
			H-=1;
			if(H<=0) {
				H=23;
				
			}
		}else if (M>=45) {
			M-=45;
		}
		System.out.println(H + " " + M);
	}
	}
}
