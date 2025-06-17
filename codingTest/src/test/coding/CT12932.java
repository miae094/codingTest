package test.coding;

public class CT12932 {
	public static void main(String[] args) {
		//자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
		CT12932 ct = new CT12932();
		int[] result = ct.solution(1378);
		System.out.println(result.toString());
	}

	public int[] solution(long n) {
		int len = String.valueOf(n).length();
        int[] answer = new int[len];
        for(int i = 0; i < len; i++) {
        	answer[i] = (int) (n % 10);
        	n = n/10;
        }
        
        return answer;
    }

}
