import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] numbers = new String[2];
		int count = Integer.parseInt(br.readLine());
		Integer result = null;

		for (int i = 0; i < count; i++) {
			numbers = br.readLine().split(" ");
			result = Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]);
			bw.write(result.toString());
			bw.newLine();
		}

		bw.flush();
		bw.close();
		br.close();
	}

}
