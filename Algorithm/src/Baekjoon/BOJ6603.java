package Baekjoon;

import java.util.Scanner;

public class BOJ6603 {
//	독일 로또는 {1, 2, ..., 49}에서 수 6개를 고른다.
//	로또 번호를 선택하는데 사용되는 가장 유명한 전략은 49가지 수 중 k(k>6)개의 수를 골라 집합 S를 만든 다음 그 수만 가지고 번호를 선택하는 것이다.
//  집합 S와 k가 주어졌을 때, 수를 고르는 모든 방법을 구하는 프로그램을 작성하시오.

	public static int k;
	public static int[] myNum;
	public static int[] arr = new int[6];
	public static boolean[] visit;
	public static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		while (true) {
			k = scanner.nextInt();

			if (k == 0)
				break;

			myNum = new int[k];
			visit = new boolean[k];

			for (int i = 0; i < k; i++) {
				myNum[i] = scanner.nextInt();
			}

			dfs(0, 0);
			System.out.println();
		}

		scanner.close();
	}

	public static void dfs(int at, int depth) {
		if (depth == 6) {
			for (int num : arr) {
				System.out.print(num + " ");
			}
			System.out.println();
			return;
		}

		for (int i = at; i < k; i++) {
			if (!visit[i]) {
				visit[i] = true;
				arr[depth] = myNum[i];
				dfs(i + 1, depth + 1);
				visit[i] = false;
			}
		}
	}

}
