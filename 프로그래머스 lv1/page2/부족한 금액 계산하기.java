class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long totalmoney = 0;
        for(int i =1; i<=count; i++){
            totalmoney += price * i;
        }
        
        if(totalmoney > money) answer = (long) totalmoney-money;
        return answer;
    }
}