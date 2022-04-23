package Baekjoon.PrefixSum;

import java.util.Scanner;

public class BOJ10986 {
//	수 N개 A1, A2, ..., AN이 주어진다. 이때, 연속된 부분 구간의 합이 M으로 나누어 떨어지는 구간의 개수를 구하는 프로그램을 작성하시오.
//	즉, Ai + ... + Aj (i ≤ j) 의 합이 M으로 나누어 떨어지는 (i, j) 쌍의 개수를 구해야 한다.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int m = scanner.nextInt();
		long[] s = new long[n];
		long[] c = new long[m];
		long answer = 0;

		s[0] = scanner.nextInt();
		for (int i = 1; i < n; i++) {
			s[i] = s[i - 1] + scanner.nextInt();
		}

		for (int i = 0; i < n; i++) {
			int remainder = (int) (s[i] % m);
			if (remainder == 0)
				answer++;
			c[remainder]++;
		}

		for (int i = 0; i < m; i++) {
			answer += c[i] * (c[i] - 1) / 2; 
		}

		System.out.println(answer);
		
		scanner.close();
	}

}
