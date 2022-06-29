import java.util.*;
import java.io.*;

class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String[] str = phone_number.split("");
        for(int i=0; i < phone_number.length()-4; i++){
            answer += "*";
        }
        for(int i = phone_number.length()-4; i < phone_number.length(); i++){
            answer += str[i];
        }
        
        return answer;
    }
}