package kr.test.coding;

public class CT12944 {

	public static void main(String[] args) {
		//정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
		
	}
	
	 public double solution(int[] arr) {
	        double answer = 0;
	        int sum = 0;
	        for (int i = 0; i < arr.length; i++) {
	        	sum += arr[i];
	        }
	        answer = sum/arr.length;
	        return answer;
	    }

}
