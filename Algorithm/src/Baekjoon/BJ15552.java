package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BJ15552 {

//	빠른 A+B
//	Java를 사용하고 있다면, Scanner와 System.out.println 대신 BufferedReader와 BufferedWriter를 사용할 수 있다. 
//	BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.
//	또한 입력과 출력 스트림은 별개이므로, 테스트케이스를 전부 입력받아서 저장한 뒤 전부 출력할 필요는 없다. 
//	테스트케이스를 하나 받은 뒤 하나 출력해도 된다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

			int t = Integer.parseInt(bufferedReader.readLine());

			for (int i = 0; i < t; i++) {
				StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
				int a = Integer.parseInt(stringTokenizer.nextToken());
				int b = Integer.parseInt(stringTokenizer.nextToken());
				int sum = a + b;
				bufferedWriter.write(sum + "\n");
			}
			bufferedWriter.flush();
			
			bufferedReader.close();
			bufferedWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
