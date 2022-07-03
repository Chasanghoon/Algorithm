class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        boolean ans[] = new boolean[10];
        
        for(int i=0; i<numbers.length; i++){
            if(ans[numbers[i]]==false) ans[numbers[i]]=true;
        }
        
        for(int i=0; i<ans.length; i++){
            if(ans[i]==false) answer += i;
        }
        return answer;
    }
}