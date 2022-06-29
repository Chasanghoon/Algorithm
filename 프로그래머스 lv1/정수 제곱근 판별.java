// class Solution {
//     public long solution(long n) {
//         long answer = 0;
//         // sqrt는 long 타입만 가능
//         double k = Math.sqrt(n);
//         if(k%1==0){
//             // pow도 double로 변경되므로 long으로 변경
//             answer = (long) Math.pow(k+1, 2);
//         }else{
//             answer = -1;
//         }
//         return answer;
//     }
// }

class Solution {
  public long solution(long n) {
      long answer = 0;

      for (long i = 1; i <= n; i++) {
          if (i * i == n) {
              answer = (i + 1) * (i + 1);
              break;
          }
          else answer = -1;
      }
      return answer;
  }
}