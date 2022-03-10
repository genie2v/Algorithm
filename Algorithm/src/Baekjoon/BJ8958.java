package Baekjoon;

import java.util.Scanner;

public class BJ8958 {
//	"OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다. 
//	문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다.
//	"OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
//	OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		String[] testCase = new String[scanner.nextInt()];
		for (int i = 0; i < testCase.length; i++) {
			testCase[i] = scanner.next();
		}
		scanner.close();
		
		for (int i = 0; i < testCase.length; i++) {
			int sum = 0;
			int point = 0;
			char[] quiz = testCase[i].toCharArray();
			for (int j = 0; j < quiz.length; j++) {
				if (quiz[j] == 'O') {
					point++;
					sum += point;
				} else {
					point = 0;
				}
			}
			System.out.println(sum);
		}

	}

}
