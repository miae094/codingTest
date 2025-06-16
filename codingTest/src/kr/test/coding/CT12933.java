package kr.test.coding;

import java.util.ArrayList;
import java.util.List;

public class CT12933 {

	public static void main(String[] args) {
		/*
		 * 함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
		 * 예를들어 n이 118372면 873211을 리턴하면 됩니다.
		 * 
		 * 제한 조건 n은 1이상 8000000000 이하인 자연수입니다.
		 */
		
		

	}
	
	public static long solution(long n) {
        long answer = 0;
        List<Long> arr = new ArrayList<Long>();
        
        while(n>10) {
        	long result = n % 10;
        	n = n/10;
        	arr.add(result);
        }
        int[] rsArr = new int[arr.size()];
        for(int i = 0 ; i < arr.size(); i++) {
        	if(arr.get(i)>arr.get(i+1)) {
        		
        	}
        }
        return answer;
    }
}
