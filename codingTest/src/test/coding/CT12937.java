package test.coding;

public class CT12937 {
	public static void main(String[] args) {
		// 정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수, solution을 완성해주세요.
	}
	
	public String solution(int num) {
        String answer = "";
        
        if(num % 2 == 0) {
        	answer = "Even";
        } else answer = "Odd";
        return answer;
    }
}
