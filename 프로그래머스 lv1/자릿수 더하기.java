// public class Solution {
//     public int solution(int n) {
//         int answer = 0;
        
//         String k = Integer.toString(n);
//         //System.out.println(k);
//         for(int i = 0; i < k.length(); i++){
//             answer += Integer.parseInt(k.substring(i, i+1));
//         }
//         return answer;
//     }
// }
public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        while(n > 0){
            answer += n%10;
            n /= 10;
        }
        return answer;
    }
}