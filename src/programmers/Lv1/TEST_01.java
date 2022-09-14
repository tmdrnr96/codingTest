package programmers.Lv1;

public class TEST_01 {

	/*문제 설명
    자연수 n이 매개변수로 주어집니다.
    n을 x로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 x를 return 하도록 solution 함수를 완성해주세요.
    답이 항상 존재함은 증명될 수 있습니다.

	제한사항
	3 ≤ n ≤ 1,000,000*/

	public static void main(String[] args) {

		int n = 10;
		int result = solution(n);

		System.out.println(result);
	}
		public static int solution(int n) {
			int answer = 1;
			boolean loof = true;

			while(loof){
				if(n%answer != 1){
					answer++;
				}else{
					loof = false;
				}
			}
			return answer;
	}

}