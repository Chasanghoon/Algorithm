import java.util.*;
import java.io.*;

class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        String[] str = s.split("");
        String[] check = new String[]{"1","2","3","4","5","6","7","8","9","0"};
        // System.out.println(Arrays.toString(str));
        // System.out.println(Arrays.toString(check));
        // System.out.println(s.length());
        // System.out.println(check.length);
        //System.out.println(s.length());
        int cnt = 0;
        
        for(int i = 0; i < s.length(); i++){
            for(int j=0; j < check.length; j++){
                if(str[i].equals(check[j])) cnt++;
            }
        }
        
        if(cnt==s.length()) answer = true;
        else answer = false;
        
        if(s.length() != 4 && s.length() != 6){
            answer = false;
        }
        return answer;
    }
}