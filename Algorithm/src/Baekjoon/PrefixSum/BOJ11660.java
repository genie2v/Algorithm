package Baekjoon.PrefixSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ11660 {
//	N×N개의 수가 N×N 크기의 표에 채워져 있다. (x1, y1)부터 (x2, y2)까지 합을 구하는 프로그램을 작성하시오. (x, y)는 x행 y열을 의미한다.
//	첫째 줄에 표의 크기 N과 합을 구해야 하는 횟수 M이 주어진다. (1 ≤ N ≤ 1024, 1 ≤ M ≤ 100,000) 
//	둘째 줄부터 N개의 줄에는 표에 채워져 있는 수가 1행부터 차례대로 주어진다. 
//	다음 M개의 줄에는 네 개의 정수 x1, y1, x2, y2 가 주어지며, (x1, y1)부터 (x2, y2)의 합을 구해 출력해야 한다. 
//	표에 채워져 있는 수는 1,000보다 작거나 같은 자연수이다. (x1 ≤ x2, y1 ≤ y2)

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

		int n = Integer.parseInt(stringTokenizer.nextToken());
		int m = Integer.parseInt(stringTokenizer.nextToken());

		int[][] a = new int[n + 1][n + 1];
		for (int i = 1; i <= n; i++) {
			stringTokenizer = new StringTokenizer(bufferedReader.readLine());
			for (int j = 1; j <= n; j++) {
				a[i][j] = Integer.parseInt(stringTokenizer.nextToken());
			}
		}

		int[][] s = new int[n + 1][n + 1];
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				s[i][j] = s[i - 1][j] + s[i][j - 1] - s[i - 1][j - 1] + a[i][j];
			}
		}

		for (int i = 1; i <= m; i++) {
			stringTokenizer = new StringTokenizer(bufferedReader.readLine());
			int x1 = Integer.parseInt(stringTokenizer.nextToken());
			int y1 = Integer.parseInt(stringTokenizer.nextToken());
			int x2 = Integer.parseInt(stringTokenizer.nextToken());
			int y2 = Integer.parseInt(stringTokenizer.nextToken());
			System.out.println(s[x2][y2] - s[x1 - 1][y2] - s[x2][y1 - 1] + s[x1 - 1][y1 - 1]);
		}

	}

}
