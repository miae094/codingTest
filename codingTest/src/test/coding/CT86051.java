package test.coding;

public class CT86051 {

	public static void main(String[] args) {
		
	}
	
	public static int solution(int[] numbers) {
        int answer = -1;
        int sum = 0;
        for (int i = 0; i<numbers.length; i++){
            sum += numbers[i];
        }
        if(sum < 45){
            answer = 45-sum;
        }
        return answer;
    }
}
