package Baekjoon.TwoPointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ1940 {
//	갑옷을 만드는 재료들은 각각 고유한 번호를 가지고 있다. 
//	갑옷은 두 개의 재료로 만드는데 두 재료의 고유한 번호를 합쳐서 M(1 ≤ M ≤ 10,000,000)이 되면 갑옷이 만들어 지게 된다. 
//	야철대장은 자신이 만들고 있는 재료를 가지고 갑옷을 몇 개나 만들 수 있는지 궁금해졌다. 
//	이러한 궁금증을 풀어 주기 위하여 N(1 ≤ N ≤ 15,000) 개의 재료와 M이 주어졌을 때 몇 개의 갑옷을 만들 수 있는지를 구하는 프로그램을 작성하시오.

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bufferedReader.readLine());
		int m = Integer.parseInt(bufferedReader.readLine());

		int[] a = new int[n];
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(stringTokenizer.nextToken());
		}

		Arrays.sort(a);
		int i = 0;
		int j = n - 1;
		int count = 0;
		while (i < j) {
			int sum = a[i] + a[j];
			if (sum < m)
				i++;
			else if (sum > m)
				j--;
			else if (sum == m) {
				i++;
				j--;
				count++;
			}
		}
		System.out.println(count);
	}

}
