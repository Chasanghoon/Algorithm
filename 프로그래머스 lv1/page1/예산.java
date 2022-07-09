import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int cnt = 0;
        Arrays.sort(d);
        
        for(int i = 0; i<d.length; i++){
            if(cnt + d[i] > budget) break;
            
            cnt += d[i];
            answer++;
            
        }
        return answer;
    }
}