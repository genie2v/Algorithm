package Baekjoon.Implementation;

import java.util.Scanner;

public class BOJ2562 {
//	9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
//	예를 들어, 서로 다른 9개의 자연수
//	3, 29, 38, 12, 57, 74, 40, 85, 61
//	이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		int[] numbers = new int[9];

		for (int i = 0; i < 9; i++) {
			numbers[i] = scanner.nextInt();
		}

		int max = numbers[0];
		int temp = 0;

		for (int i = 1; i < 9; i++) {
			if (max < numbers[i]) {
				max = numbers[i];
				temp = i;
			}
		}
		System.out.println(max);
		System.out.println(temp + 1);

		scanner.close();
	}

}
