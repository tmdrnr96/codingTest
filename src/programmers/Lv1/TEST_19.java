package programmers.Lv1;

public class TEST_19 {
	/*
	문제 설명
	길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요.
	예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.

	제한 조건
	n은 길이 10,000이하인 자연수입니다.
	*/

	//StringBuffer를 사용하면 좀 나을까..? 음..
	public static void main(String[] args) {

		int n = 5;
		String result = solution(n);

		System.out.println(result);
	}
	public static String solution(int n) {
		String answer = "";
		String str = "수박";
		int cnt = 0;

		for(int i = 0; i < n; i++){
			if(cnt == 2) cnt=0;
				answer+=str.charAt(cnt);
				cnt++;
		}
		return answer;
	}
}
