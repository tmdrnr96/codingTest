package programmers.Lv1;

import java.util.Arrays;

public class TEST_17 {
	/*
	array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
	divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.

	제한사항
	arr은 자연수를 담은 배열입니다.
	정수 i, j에 대해 i ≠ j 이면 arr[i] ≠ arr[j] 입니다.
	divisor는 자연수입니다.
	array는 길이 1 이상인 배열입니다.
	*/
	public static void main(String[] args) {
		int[] arr = {5, 9, 7, 10};
		int n = 5;
		int[] result = solution(arr, n);

		System.out.println(Arrays.toString(result));
	}

	public static int[] solution(int[] arr, int divisor) {

		int cnt = 0;
		int idx = 0;

		for(int i = 0; i < arr.length; i++){ //나머지가 0인 값의 갯수
			if(arr[i]%divisor == 0){
				cnt++;
			}
		}
		int[] answer = new int[cnt != 0? cnt : 1]; //배열의 길이(나머지가 0인 값만큼, 없으면 1)
		for(int i = 0; i < arr.length; i++){
			if(cnt == 0){	//나머지가 0이 되는 값이 없다면 [-1] 리턴
				answer[0] = -1;
			}
			if(arr[i]%divisor == 0){ // 나머지가 0이 되는 값을 answer 배열에 넣어줌.
				answer[idx] = arr[i];
				idx++;
			}
		}
		return Arrays.stream(answer).sorted().toArray();//stream함수를 통해 정렬을 해줌
	}
}
