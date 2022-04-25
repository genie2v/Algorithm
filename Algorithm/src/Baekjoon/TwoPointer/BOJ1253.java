package Baekjoon.TwoPointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ1253 {
//	N개의 수 중에서 어떤 수가 다른 수 두 개의 합으로 나타낼 수 있다면 그 수를 “좋다(GOOD)”고 한다.
//	N개의 수가 주어지면 그 중에서 좋은 수의 개수는 몇 개인지 출력하라.
//	수의 위치가 다르면 값이 같아도 다른 수이다.

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bufferedReader.readLine());
		int result = 0;
		
		int[] a = new int[n];
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(stringTokenizer.nextToken());
		}
		Arrays.sort(a);
		
		for (int k = 0; k < n; k++) {
			int find = a[k];
			int i = 0;
			int j = n - 1;
			while (i < j) {
				if (a[i] + a[j] == find) {
					if (i != k && j != k) {
						result++;
						break;
					} else if (i == k) {
						i++;
					} else if (j == k) {
						j--;
					}
				} else if (a[i] + a[j] < find) {
					i++;
				} else {
					j--;
				}
			}
		}
		System.out.println(result);
	}

}
