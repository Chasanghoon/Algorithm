import java.util.*;
import java.io.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =0; i<nums.length; i++){
            if(!list.contains(nums[i])){
                list.add(nums[i]);
                answer++;
            }
        }
        
        if(answer >= nums.length/2) answer = nums.length/2;
        
        return answer;
    }
}