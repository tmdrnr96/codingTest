package programmers.Lv1;

public class TEST_20 {
	/*
	문제 설명
	단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요.
	단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.

	재한사항
	s는 길이가 1 이상, 100이하인 스트링입니다.
	*/
	public static void main(String[] args) {
		String str = "abcde";
		String result = solution(str);

		System.out.println(result);
	}
	public static String solution(String s) {
		String answer = "";
		String[] strArr = new String[s.length()];
		int idx = s.length()/2;

		for(int i = 0; i < strArr.length; i++){
			strArr[i] = String.valueOf(s.charAt(i));
		}
		if(s.length()%2 == 0){
			answer = strArr[idx-1] + strArr[idx];
		}else{
			answer = strArr[idx];
		}
		return answer;
	}
}
