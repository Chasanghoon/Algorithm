class Solution {
    public String solution(String s, int n) {
        String[] k = new String[s.length()];
        //String[] al = new String[]{"a","b","c", "d", "e", "f", "g", "h", "i", "j", "k", "l","m","n","o","p", "q", "r","s","t","u", "v","w","x","y","z"};
        char[] al = new char[]{'a','b','c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l','m','n','o','p', 'q', 'r','s','t','u', 'v','w','x','y','z'};
        //String[] AL = new String[]{"A","B","C","D","E", "F", "G", "H", "I", "J", "K", "L","M","N","O","P", "Q", "R","S","T","U","V","W","X","Y","Z"};
        char[] AL = new char[]{'A','B','C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L','M','N','O','P', 'Q', 'R','S','T','U', 'V','W','X','Y','Z'};
        // 정답용
        String answer = "";
        
        for(int i = 0; i<s.length(); i++){
            for(int j=0; j<26; j++){
                if(s.charAt(i)==al[j]){
                    answer += al[(j+n)%26];
                }
            } 
            
            for(int j=0; j<26; j++){
                if(s.charAt(i)==AL[j]){
                    answer += AL[(j+n)%26];
                }
            }
            if(s.charAt(i)==' ') answer += ' ';
            
        }
        
        return answer;
    }
}