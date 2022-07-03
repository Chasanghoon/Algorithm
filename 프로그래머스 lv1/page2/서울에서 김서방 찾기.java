class Solution {
    public String solution(String[] seoul) {
        String temp = "Kim";
        String k = "";
        for(int i=0; i<seoul.length; i++){
            if(temp.equals(seoul[i])) k = Integer.toString(i);
        }
        String answer = "김서방은 ";
        answer += k;
        answer += "에 있다";
        return answer;
    }
}