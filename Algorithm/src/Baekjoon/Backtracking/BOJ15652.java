package Baekjoon.Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ15652 {
//	자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.
//	- 1부터 N까지 자연수 중에서 M개를 고른 수열
//	- 같은 수를 여러 번 골라도 된다.
//	- 고른 수열은 비내림차순이어야 한다.

	public static int[] arr;
	public static int n, m;
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

		n = Integer.parseInt(stringTokenizer.nextToken());
		m = Integer.parseInt(stringTokenizer.nextToken());

		arr = new int[m];

		dfs(1, 0);

		System.out.println(sb);

	}

	public static void dfs(int at, int depth) {
		if (m == depth) {
			for (int num : arr) {
				sb.append(num).append(' ');
			}
			sb.append('\n');
			return;
		}

		for (int i = at; i <= n; i++) {
			arr[depth] = i;
			dfs(i, depth + 1);
		}
	}

}
