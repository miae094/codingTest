package test.coding;

public class CT12922 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(5));
	}

	public static String solution(int n) {
		String answer = "";
		StringBuilder sb = new StringBuilder();
		
		for(int i = 1; i <= n; i ++) {
			if(i % 2 == 0) {
				sb.append("박");
			} else {
				sb.append("수");
			}
		}
		answer = sb.toString();
		return answer;
	}

}
