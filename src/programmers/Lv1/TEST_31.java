package programmers.Lv1;

public class TEST_31 {
    /*
    문제 설명
    자연수 n이 매개변수로 주어집니다. n을 3진법 상에서 앞뒤로 뒤집은 후,
    이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.

    제한사항
    n은 1 이상 100,000,000 이하인 자연수입니다.
    */
    public static void main(String[] args) {
        int n = 45;
        int result = solution(n);
        System.out.println(result);
    }

    public static int solution(int n) {
        int answer = 0;
        int cnt = 1;
        String remainder = ""; // 나머지

        while (n/3 != 0){
            remainder +=  String.valueOf(n % 3);
            n = n/3;
        }
        remainder += n;
        String[] arr = remainder.split("");

        for(int i = arr.length-1; i >= 0; i-- ){
            answer += (Integer.parseInt(arr[i]) * cnt);
            cnt*=3;
        }
        return answer;
    }
}
