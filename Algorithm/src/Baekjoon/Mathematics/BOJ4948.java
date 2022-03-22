package Baekjoon.Mathematics;

import java.util.Scanner;

public class BOJ4948 {
//	베르트랑 공준은 임의의 자연수 n에 대하여, n보다 크고, 2n보다 작거나 같은 소수는 적어도 하나 존재한다는 내용을 담고 있다.
//	이 명제는 조제프 베르트랑이 1845년에 추측했고, 파프누티 체비쇼프가 1850년에 증명했다.
//	예를 들어, 10보다 크고, 20보다 작거나 같은 소수는 4개가 있다. (11, 13, 17, 19) 또, 14보다 크고, 28보다 작거나 같은 소수는 3개가 있다. (17,19, 23)
//	자연수 n이 주어졌을 때, n보다 크고, 2n보다 작거나 같은 소수의 개수를 구하는 프로그램을 작성하시오. 1 ≤ n ≤ 123,456

	public static boolean[] prime = new boolean[246913];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		getPrime();

		while (true) {
			int n = scanner.nextInt();

			if (n == 0)
				break;
			
			int count = 0;
			for (int i = n + 1; i <= 2 * n; i++) {
				if(!prime[i]) count++;
			}
			
			System.out.println(count);
		}

		scanner.close();
	}

	// 에라토스테네스의 체 사용
	public static void getPrime() {
		// true는 소수아님, false는 소수
		prime[0] = prime[1] = true;

		for (int i = 2; i < Math.sqrt(prime.length); i++) {
			if (prime[i])
				continue;
			for (int j = i * i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}
	}

}
