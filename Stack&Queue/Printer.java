import java.util.*;

//https://programmers.co.kr/learn/courses/30/lessons/42587
//Programmers  stack/Queue  중  프린터 문제
public class Printer {

	public static void main(String[] args) {
		int[] priorities = { 1, 1, 9, 1, 1, 1 };
		int location = 2;

		System.out.println(solution(priorities, location));
	}

	public static int solution(int[] priorities, int location) {
		int answer = 0;

		LinkedList<Paper> list = new LinkedList();
		// Document DTO를 담을 LinkedList생성

		for (int i = 0; i < priorities.length; i++) {
			list.add(new Paper(i, priorities[i]));
		}
		// index(location)를 0번부터 지정하여 LinkedList에 Document 인스턴스를 하나씩 담음

		while (list.size() > 1) { // ?
			Paper firstPaper = list.getFirst();

			for (int i = 1; i < list.size(); i++) {
				if (firstPaper.priority < list.get(i).priority) {
					list.addLast(firstPaper);
					list.removeFirst();
					break;
				}

				if (i == list.size() - 1) {
					if (firstPaper.index == location)
						return answer;
					list.removeFirst();
					answer++;
				}
			}
		}
		return answer;
	}
}

class Paper {
	int index;
	int priority;

	public Paper(int idx, int priority) {
		super();
		this.index = index;
		this.priority = priority;
	}
}
