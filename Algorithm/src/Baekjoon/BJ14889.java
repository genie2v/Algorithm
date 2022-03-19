package Baekjoon;

import java.util.Scanner;

public class BJ14889 {
//	오늘은 스타트링크에 다니는 사람들이 모여서 축구를 해보려고 한다. 축구는 평일 오후에 하고 의무 참석도 아니다. 
//	축구를 하기 위해 모인 사람은 총 N명이고 신기하게도 N은 짝수이다. 이제 N/2명으로 이루어진 스타트 팀과 링크 팀으로 사람들을 나눠야 한다.
//	BOJ를 운영하는 회사 답게 사람에게 번호를 1부터 N까지로 배정했고, 아래와 같은 능력치를 조사했다. 능력치 Sij는 i번 사람과 j번 사람이 같은 팀에 속했을 때,
//	팀에 더해지는 능력치이다. 팀의 능력치는 팀에 속한 모든 쌍의 능력치 Sij의 합이다. Sij는 Sji와 다를 수도 있으며, i번 사람과 j번 사람이 같은 팀에 속했을 때, 
//	팀에 더해지는 능력치는 Sij와 Sji이다. 축구를 재미있게 하기 위해서 스타트 팀의 능력치와 링크 팀의 능력치의 차이를 최소로 하려고 한다.

	public static int n;
	public static int[][] map;
	public static boolean[] visit;
	public static int min = Integer.MAX_VALUE;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		n = scanner.nextInt();
		map = new int[n][n];
		visit = new boolean[n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				map[i][j] = scanner.nextInt();
			}
		}

		teamCombi(0, 0);

		System.out.println(min);
		
		scanner.close();

	}

	public static void teamCombi(int idx, int depth) {
		if (depth == n / 2) {
			teamStatDiff();
			return;
		}

		for (int i = idx; i < n; i++) {
			if (!visit[i]) {
				visit[i] = true;
				teamCombi(i + 1, depth + 1);
				visit[i] = false;
			}
		}
	}

	public static void teamStatDiff() {
		int teamStart = 0;
		int teamLink = 0;

		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (visit[i] && visit[j]) {
					teamStart += map[i][j];
					teamStart += map[j][i];
				} else if (!visit[i] && !visit[j]) {
					teamLink += map[i][j];
					teamLink += map[j][i];
				}
			}
		}

		int diff = Math.abs(teamLink - teamStart);
		min = Math.min(diff, min);
	}

}
