class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int temp1 = Math.max(a,b);
        int temp2 = Math.min(a,b);
        for(int i=temp2; i<=temp1; i++){
            answer += i;
        }
        return answer;
    }
}