package Programmers.Hash;

import java.util.HashMap;
import java.util.Iterator;

public class 완주하지못한선수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] participant = { "leo", "kiki", "eden" };
		String[] completion = { "eden", "kiki" };

		System.out.println(solution(participant, completion));
	}

	public static String solution(String[] participant, String[] completion) {
		String answer = "";

		HashMap<String, Integer> people = new HashMap<>();
		for (String p : participant) {
			if (people.containsKey(p)) {
				people.put(p, people.get(p) + 1);
			} else {
				people.put(p, 1);
			}
		}

		for (String c : completion) {
			if (people.containsKey(c)) {
				people.put(c, people.get(c) - 1);
			}
		}

		Iterator<String> iterator = people.keySet().iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			if (people.get(key) != 0) {
				answer = key;
			}
		}
		return answer;
	}

}
