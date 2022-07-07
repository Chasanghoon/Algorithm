import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i = 0; i < numbers.length-1; i++){
            for(int j = i+1; j<numbers.length; j++){
                int k = numbers[i] + numbers[j];
                if(!answer.contains(k)) answer.add(k);
            }
        }
        Collections.sort(answer);
        
        int[] answers = new int[answer.size()];
        for(int i =0; i < answers.length; i++){
            answers[i] = answer.get(i);
        }
        
        return answers;
    }
}