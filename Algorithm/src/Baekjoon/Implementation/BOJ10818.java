package Baekjoon.Implementation;

import java.util.Scanner;

public class BOJ10818 {
//	N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int[] number = new int[n];

		for (int i = 0; i < n; i++) {
			number[i] = scanner.nextInt();
		}

		int minimum = number[0];
		int maximun = number[0];

		for (int i = 1; i < n; i++) {
			if (minimum > number[i])
				minimum = number[i];
			if (maximun < number[i])
				maximun = number[i];
		}
		
		System.out.println(minimum + " " + maximun);

		scanner.close();
	}

}
