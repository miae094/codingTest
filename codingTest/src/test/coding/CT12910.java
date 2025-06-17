package test.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CT12910 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 3,2,6 };
		System.out.println(solution(arr, 10));

	}

	public static int[] solution(int[] arr, int divisor) {
		int[] answer = {};
		List<Integer> temp = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % divisor == 0) {
				temp.add(arr[i]);
			}
		}

		if (temp.size() == 0) {
			answer = new int[]{-1};
			return answer;
		} else {
			answer = new int[temp.size()];
			for (int i = 0; i < temp.size(); i++) {
				answer[i] = temp.get(i);
			}

			Arrays.sort(answer);
		}

		return answer;
	}
}
