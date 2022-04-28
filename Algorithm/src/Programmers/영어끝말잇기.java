package Programmers;

import java.util.HashMap;

public class 영어끝말잇기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = { "tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank" };
		String[] words2 = { "hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure",
				"establish", "hang", "gather", "refer", "reference", "estimate", "executive" };
		String[] words3 = { "hello", "one", "even", "never", "now", "world", "draw" };

		int[] result = solution(3, words);
		System.out.println(result[0] + " " + result[1]);
		result = solution(5, words2);
		System.out.println(result[0] + " " + result[1]);
		result = solution(2, words3);
		System.out.println(result[0] + " " + result[1]);


	}

	public static int[] solution(int n, String[] words) {
		int[] answer = new int[2];

		int player = 1;
		int turn = 1;
		String prev = "";
		HashMap<String, Integer> word = new HashMap<>();

		for (int i = 0; i < words.length; i++) {
			String now = words[i];

			if (i > 0) {
				char nowChar = now.charAt(0);
				char prevChar = prev.charAt(prev.length() - 1);
				if (nowChar != prevChar || word.containsKey(now)) {
					answer[0] = player;
					answer[1] = turn;
					break;
				}
			}

			prev = now;
			word.put(now, 1);

			if (player == n) {
				player = 1;
				turn++;
				continue;
			}
			player++;
		}

		return answer;
	}

}
