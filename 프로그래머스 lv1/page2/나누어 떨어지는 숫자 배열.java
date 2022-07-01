import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = new int[arr.length];
        int cnt = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] % divisor == 0) cnt++;
            else arr[i] = 0;
        }
        
        int[] answers = new int[cnt];
        int temp = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]!=0) answers[temp++] = arr[i];
        }
        Arrays.sort(answers);
        
        if(cnt==0){
            answers = new int[1];
            answers[0] = -1;
        }
        return answers;
    }
}