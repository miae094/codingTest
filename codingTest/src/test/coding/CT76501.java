package test.coding;

public class CT76501 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
       
        for(int i = 0; i < absolutes.length; i++){
            if(signs[i]){
                answer += absolutes[i];
            } else{
                answer -= absolutes[i];
            }
        }
        
        return answer;
    }

}
