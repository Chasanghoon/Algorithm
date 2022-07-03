class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        String str[] = s.split("");
        String p = "p";
        String P = "P";
        String y = "y";
        String Y = "Y";
        
        int cnt1 = 0;
        int cnt2 = 0;
        for(int i=0; i<s.length(); i++){
            if(p.equals(str[i])) cnt1++;
            if(P.equals(str[i])) cnt1++;
            if(y.equals(str[i])) cnt2++;
            if(Y.equals(str[i])) cnt2++;
        }
        if(cnt1==cnt2) answer = true;
        else answer = false;
        return answer;
    }
}