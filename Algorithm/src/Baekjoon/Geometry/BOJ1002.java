package Baekjoon.Geometry;

import java.util.Scanner;

public class BOJ1002 {
//	이석원은 조규현과 백승환에게 상대편 마린(류재명)의 위치를 계산하라는 명령을 내렸다. 조규현과 백승환은 각각 자신의 터렛 위치에서 현재 적까지의 거리를 계산했다.
//	조규현의 좌표 (x1, y1)와 백승환의 좌표 (x2, y2)가 주어지고, 조규현이 계산한 류재명과의 거리 r1과 백승환이 계산한 류재명과의 거리 r2가 주어졌을 때, 
//	류재명이 있을 수 있는 좌표의 수를 출력하는 프로그램을 작성하시오.
//	류재명이 있을 수 있는 위치의 개수가 무한대일 경우에는 -1을 출력한다.

//	두 점 사이의 거리, 두 원 사이의 관계
//	두 점에서 만날 때 |r1+r2| > d, |r1-r2| < d
//	외접 r1+r2 = d / 내접 |r1-r2| = d
//	중점이 같고 반지름이 다를 때 0 / 두 원의 크기가 같고 중점이 같을 때 무한대(-1)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int t = scanner.nextInt();
		for (int i = 0; i < t; i++) {
			int x1 = scanner.nextInt();
			int y1 = scanner.nextInt();
			int r1 = scanner.nextInt();
			int x2 = scanner.nextInt();
			int y2 = scanner.nextInt();
			int r2 = scanner.nextInt();

			if (x1 == x2 && y1 == y2 && r1 == r2) {
				System.out.println(-1);
			} else if (Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2)) < Math.abs(r1 + r2)
					&& Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2)) > Math.abs(r1 - r2)) {
				System.out.println(2);
			} else if (Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2)) == r1 + r2) {
				System.out.println(1);
			} else if (Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2)) == Math.abs(r1 - r2)) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
		}

		scanner.close();
	}

}
