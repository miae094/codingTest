package kr.test.coding;

public class CT12903 {

	public static void main(String[] args) {
		/*
		 * 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
		 * 
		 * 재한사항 s는 길이가 1 이상, 100이하인 스트링입니다.
		 */
		System.out.println(solution("string0"));
	}

	public static String solution(String s) {
        String answer = "";
        
        int length = s.length();
        
        if(length % 2 == 0) {
        	answer = s.substring(length/2-1, length/2+1);
        } else {
        	answer = s.substring(length/2, length/2+1);
        }
        
        return answer;
    }
	
}


/*
 *
 * 
 * class StringExercise{
    String getMiddle(String word){
return word.substring((word.length()-1)/2, word.length()/2 + 1);
    }
    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void  main(String[] args){
        StringExercise se = new StringExercise();
        System.out.println(se.getMiddle("power"));
    }
}
 * 
 * 
 * */
 