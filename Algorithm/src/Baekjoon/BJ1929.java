package Baekjoon;

import java.util.Scanner;

public class BJ1929 {
//	M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.
//	에라토스테네스의 체

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int m = scanner.nextInt();
		int n = scanner.nextInt();

		getPrime(m, n);

		scanner.close();
	}

	public static void getPrime(int m, int n) {
		boolean[] primeCheck = new boolean[n + 1];

		// true 소수아님, false 소
		primeCheck[0] = primeCheck[1] = true;
		for (int i = 2; i < Math.sqrt(primeCheck.length); i++) {
			if (primeCheck[i])
				continue;
			for (int j = i * i; j < primeCheck.length; j += i) {
				primeCheck[j] = true;
			}
		}

		for (int i = m; i <= n; i++) {
			if (!primeCheck[i])
				System.out.println(i);
		}
	}

}
