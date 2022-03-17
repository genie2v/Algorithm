package Baekjoon;

import java.util.Scanner;

public class BJ14888 {
//	N개의 수로 이루어진 수열 A1, A2, ..., AN이 주어진다. 또, 수와 수 사이에 끼워넣을 수 있는 N-1개의 연산자가 주어진다. 
//	연산자는 덧셈(+), 뺄셈(-), 곱셈(×), 나눗셈(÷)으로만 이루어져 있다.
//	우리는 수와 수 사이에 연산자를 하나씩 넣어서, 수식을 하나 만들 수 있다. 이때, 주어진 수의 순서를 바꾸면 안 된다.
//	식의 계산은 연산자 우선 순위를 무시하고 앞에서부터 진행해야 한다.
//	N개의 수와 N-1개의 연산자가 주어졌을 때, 만들 수 있는 식의 결과가 최대인 것과 최소인 것을 구하는 프로그램을 작성하시오.

	public static int[] number;
	public static int[] oper = new int[4];
	public static int n;
	public static int max = Integer.MIN_VALUE;
	public static int min = Integer.MAX_VALUE;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		n = scanner.nextInt();
		number = new int[n];
		for (int i = 0; i < n; i++) {
			number[i] = scanner.nextInt();
		}
		for (int i = 0; i < 4; i++) {
			oper[i] = scanner.nextInt();
		}

		dfs(number[0], 1);

		System.out.println(max);
		System.out.println(min);

		scanner.close();
	}

	public static void dfs(int num, int depth) {
		if (depth == n) {
			max = Math.max(max, num);
			min = Math.min(min, num);
			return;
		}

		for (int i = 0; i < 4; i++) {
			if (oper[i] > 0) {
				oper[i]--;

				switch (i) {
				case 0:
					dfs(num + number[depth], depth + 1);
					break;
				case 1:
					dfs(num - number[depth], depth + 1);
					break;
				case 2:
					dfs(num * number[depth], depth + 1);
					break;
				case 3:
					dfs(num / number[depth], depth + 1);
					break;
				}

				oper[i]++;
			}
		}
	}

}
