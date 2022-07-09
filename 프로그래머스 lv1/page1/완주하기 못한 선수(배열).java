import java.util.*;
import java.io.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);
        //System.out.println(Arrays.toString(participant));
        //System.out.println(Arrays.toString(completion));
        
        // 중요 포인트
        int i;
        for(i = 0; i<completion.length; i++){
            if(!participant[i].equals(completion[i]))
            return participant[i];
        }
        return participant[i];
    }
}