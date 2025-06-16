package kr.test.coding;

public class CT12916 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution("Pyy");
	}

	static boolean solution(String s) {
        boolean answer = true;

        int length = String.valueOf(s).length();
        System.out.println("length : " + length);
        String result = "";
        int p=0;
        int y=0;
        for (int i = 0; i < length; i++) {
        	 result = s.substring(i, i+1).toLowerCase();
        	 System.out.println(result);
        	 if(result.equals("p")) {
        		 p++;
        	 } else if(result.equals("y")) {
        		 y++;
        	 }
        }
        System.out.println(p +" / " + y);
        if(p==y) {
        	answer=true;
        } else answer=false;
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}
