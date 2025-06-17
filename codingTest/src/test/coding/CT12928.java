package test.coding;

public class CT12928 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CT12928 ct = new CT12928();
		int result = ct.solution(12);
		System.out.println(result);
	}

	
	public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer += i;
            }
        }
        return answer;
    }
}
