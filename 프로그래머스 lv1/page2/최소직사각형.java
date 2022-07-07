class Solution {
    public int solution(int[][] sizes) {
        int max_width = 0;
        int max_height = 0;
        int answer = 0;
        
        for(int i = 0; i<sizes.length; i++){
            int temp;
            if(sizes[i][0] >= sizes[i][1]){
                temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
            
            if(max_width <= sizes[i][0]) max_width = sizes[i][0];
            
            if(max_height <= sizes[i][1]) max_height = sizes[i][1];
        }
        
        answer = max_width * max_height;
        
        return answer;
    }
}