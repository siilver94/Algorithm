import java.util.ArrayList;

public class IronBar {
	public static void main(String[] args) {
		System.out.println(solution("()(((()())(())()))(())"));
	}

	public static int solution(String arrangement) {

		// copyArray 는 arrangement 중에 ()'레이저' 를 알아 보기 쉽게 replace()를 사용하여 0으로 바꾼후 answer
		// 초기화
		String copyArray = arrangement.replace("()", "0");
		// answer 는 토막난 막대기 수.
		int answer = 0;

		ArrayList<Character> copy = new ArrayList<Character>();

		// copy 라는 ArrayList에 한자씩 쪼개어 배열로 넣습니다.
		for (int i = 0; i < copyArray.length(); i++) {
			copy.add(copyArray.charAt(i));
		}

		ArrayList<Character> stack = new ArrayList<Character>();

		for (int i = 0; i < copy.size(); i++) {
			// '('를 만날경우 stack 에 add를 해줍니다.
			if (copy.get(i) == '(') {
				stack.add(copy.get(i));
				/*
				 * ')'를 만날경우 막대기의 끝이므로 stack size(막대기 수)를 줄여주고 answer에 1을 추가해줍니다. ex)stack의 pop
				 */
			} else if (copy.get(i) == ')') {
				stack.remove(stack.size() - 1);
				answer += 1;
				// 0, 즉 레이저를 만날경우 현재까지의 stack 값을 answer에 더해줍니다
			} else if (copy.get(i) == '0') {
				answer += stack.size();
			}
			/*
			 * 레이저를 만나기전 '('의 갯수는 토막난 막대기의 수 레이저가 아닌 ')'를 만나면 한 막대기가 끝낫다는 뜻이니, 끝부분 추가 +1
			 */
		}
		return answer;
	}
}
