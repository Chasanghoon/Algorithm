import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(int[] arr) {
        //int[] answer = new int[];
        
        //System.out.println(arr.length);
        if(arr.length == 1) {
            int[] answer = new int[arr.length];
            answer[0] = -1;
            return answer;
        }else{
            int[] answer = new int[arr.length-1];
            int min = arr[0];
            // 실수한 포인트: int min = 0;
            for(int i = 0; i<arr.length; i++){
                min = Math.min(min, arr[i]);
            }
            
            int idx = 0;
            for(int i = 0; i<arr.length; i++){
                if(arr[i] == min) continue;
                answer[idx++] = arr[i];
            }
                    
            return answer;
        }
    }
}