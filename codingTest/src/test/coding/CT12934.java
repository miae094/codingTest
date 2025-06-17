package test.coding;

public class CT12934 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(solution(3));
	}

	public static long solution(long n) {
        long answer = 0;
        
        double result = Math.sqrt(n);
        System.out.println(result);
        if (result % 1 == 0 && result > 0) {
        	answer = (long) Math.pow(result+1, 2);
        } else {
        	answer = -1;
        }
        return answer;
    }
}
