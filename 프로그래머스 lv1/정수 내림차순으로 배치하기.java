import java.util.*;
import java.io.*;

class Solution {
    public long solution(long n) {
        String str = String.valueOf(n);
        char[] s = str.toCharArray();
        Arrays.sort(s);
        
        String answer = "";
        for(int i=s.length-1; i >= 0; i--){
            answer += s[i];
        }
        long answers = Long.parseLong(answer);
        
        return answers;
    }
}