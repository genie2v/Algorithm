package Baekjoon.SlidingWindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ12891 {
//	평소에 문자열을 가지고 노는 것을 좋아하는 민호는 DNA 문자열을 알게 되었다. DNA 문자열은 모든 문자열에 등장하는 문자가 {‘A’, ‘C’, ‘G’, ‘T’} 인 문자열을 말한다. 
//	민호가 만든 임의의 DNA 문자열과 비밀번호로 사용할 부분분자열의 길이, 그리고 {‘A’, ‘C’, ‘G’, ‘T’} 가 각각 몇번 이상 등장해야 비밀번호로 사용할 수 있는지 
//	순서대로 주어졌을 때 민호가 만들 수 있는 비밀번호의 종류의 수를 구하는 프로그램을 작성하자. 
//	단 부분문자열이 등장하는 위치가 다르다면 부분문자열이 같다고 하더라도 다른 문자열로 취급한다.

	static int[] checkArr = new int[4];
	static int[] myArr = new int[4];
	static int checkPw = 0;

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

		int s = Integer.parseInt(stringTokenizer.nextToken());
		int p = Integer.parseInt(stringTokenizer.nextToken());
		int result = 0;
		char[] a = new char[s];
		a = bufferedReader.readLine().toCharArray();

		stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		for (int i = 0; i < 4; i++) {
			checkArr[i] = Integer.parseInt(stringTokenizer.nextToken());
			if (checkArr[i] == 0) {
				checkPw++;
			}
		}

		for (int i = 0; i < p; i++) {
			add(a[i]);
		}
		if (checkPw == 4) {
			result++;
		}

		// 슬라이딩윈도우처리
		for (int i = p; i < s; i++) {
			int j = i - p;
			add(a[i]);
			remove(a[j]);

			if (checkPw == 4)
				result++;

		}

		System.out.println(result);
		bufferedReader.close();
	}

	private static void add(char c) {
		switch (c) {
		case 'A':
			myArr[0]++;
			if (checkArr[0] == myArr[0])
				checkPw++;
			break;
		case 'C':
			myArr[1]++;
			if (checkArr[1] == myArr[1])
				checkPw++;
			break;
		case 'G':
			myArr[2]++;
			if (checkArr[2] == myArr[2])
				checkPw++;
			break;
		case 'T':
			myArr[3]++;
			if (checkArr[3] == myArr[3])
				checkPw++;
			break;
		}
	}

	private static void remove(char c) {
		switch (c) {
		case 'A':
			if (checkArr[0] == myArr[0])
				checkPw--;
			myArr[0]--;
			break;
		case 'C':
			if (checkArr[1] == myArr[1])
				checkPw--;
			myArr[1]--;
			break;
		case 'G':
			if (checkArr[2] == myArr[2])
				checkPw--;
			myArr[2]--;
			break;
		case 'T':
			if (checkArr[3] == myArr[3])
				checkPw--;
			myArr[3]--;
			break;
		}
	}

}
