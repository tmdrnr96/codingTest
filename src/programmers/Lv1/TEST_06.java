package programmers.Lv1;

import java.util.Arrays;

public class TEST_06 {
	/*
	문제 설명
	자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

	제한 조건
	n은 10,000,000,000이하인 자연수입니다.
	*/
	public static void main(String[] args) {
		long n = 12345;
		int[] result = solution(n);

		System.out.println(Arrays.toString(result));
	}

	public static int[] solution(long n) {
		String str = String.valueOf(n);
		int[] answer = new int[str.length()];
		int cnt = 0;

		for(int i = str.length()-1; i >= 0; i--){
			answer[cnt] = Integer.parseInt(String.valueOf(str.charAt(i)));
			cnt++;
		}
		return answer;
	}
}
