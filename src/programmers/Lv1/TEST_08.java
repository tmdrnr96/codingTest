package programmers.Lv1;

import java.util.Arrays;

public class TEST_08 {
	/*
	문제 설명
	함수 solution은 정수 n을 매개변수로 입력받습니다.
	n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
	예를들어 n이 118372면 873211을 리턴하면 됩니다.

	제한 조건
	n은 1이상 8000000000 이하인 자연수입니다.
	*/
	public static void main(String[] args) {
		long n = 118372;
		long result = solution(n);

		System.out.println(result);
	}

	public static long solution(long n) {
		long answer = 0;
		int max = 0;
		int idx = 0;
		String result = "";
		String str = String.valueOf(n);
		int[] arr = new int[str.length()];

		for(int i = 0; i < str.length(); i++){
			arr[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
		}

		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr.length; j++){
				if(max <= arr[j]){
					max = arr[j];
					idx = j;
				}
			}
			result+=String.valueOf(max);
			max = 0;
			arr[idx] = 0;
		}
		answer = Long.parseLong(result);
		return answer;
	}
}
