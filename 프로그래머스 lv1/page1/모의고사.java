import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(int[] answers) {
        
        int[] answer1 = new int[]{1, 2, 3, 4, 5};
        int[] answer2 = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        int[] answer3 = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int cnt[] = new int[3];
        for(int i = 0; i<answers.length; i++){
            if(answers[i] == answer1[i%5]) cnt[0]++;
            if(answers[i] == answer2[i%8]) cnt[1]++;
            if(answers[i] == answer3[i%10]) cnt[2]++;
        }
        
        int temp=0;
        for(int i = 0; i < cnt.length; i++){
            temp = Math.max(temp, cnt[i]);
        }
        
        int temps = 0;
        for(int i = 0; i < cnt.length; i++){
            if(cnt[i] == temp) temps++;
        }
        
        int[] answer = new int[temps];
        int idx = 0;
        for(int i = 0; i < cnt.length; i++){
            if(cnt[i] == temp) answer[idx++] = i+1;
        }
        //System.out.println(Arrays.toString(cnt));
        return answer;
    }
} 