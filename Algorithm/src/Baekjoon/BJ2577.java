package Baekjoon;

import java.util.Scanner;

public class BJ2577 {

//	세 개의 자연수 A, B, C가 주어질 때 A × B × C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.
//	예를 들어 A = 150, B = 266, C = 427 이라면 A × B × C = 150 × 266 × 427 = 17037300 이 되고,
//	계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();

		String result = Integer.toString(a * b * c);
		int n = result.length();

		String[] resultNum = new String[n];
		for (int i = 0; i < n; i++) {
			resultNum[i] = String.valueOf(result.charAt(i));
		}

		// char[] number = new char[9];
		int[] numCount = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < n; j++) {
				if(i==Integer.parseInt(resultNum[j]))
						numCount[i]++;
			}
		}

		for (int i = 0; i <10; i++)
			System.out.println(numCount[i]);
		scanner.close();
	}

}
