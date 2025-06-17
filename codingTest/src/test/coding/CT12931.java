package test.coding;

public class CT12931 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CT12931 ct = new CT12931();
		int result = ct.solution(127);
		System.out.println(result);
	}

	public int solution(int n) {
		int answer = 0;
		while ( n > 0) {
			answer += n % 10;
			n = n/10;
		}
		
		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("Hello Java");

		return answer;
	}

}
