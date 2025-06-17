package test.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CT12933 {

	public static void main(String[] args) {
		/*
		 * 함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
		 * 예를들어 n이 118372면 873211을 리턴하면 됩니다.
		 * 
		 * 제한 조건 n은 1이상 8000000000 이하인 자연수입니다.
		 */
		
		System.out.println(solution(118372));

	}

	public static long solution(long n) {
		long answer = 0;
		
		int length = String.valueOf(n).length();
		
		List<Long> arr = new ArrayList<>();
		for(int i = 0; i < length; i++) {
			long temp1 = n%10;
			arr.add(temp1);
			n = n/10;
		}
		
		Collections.sort(arr, Collections.reverseOrder());
		StringBuilder sb = new StringBuilder();
		for(Long num : arr) {
		    sb.append(num);
		}

		answer = Long.parseLong(sb.toString());
		
		return answer;
	}
}
