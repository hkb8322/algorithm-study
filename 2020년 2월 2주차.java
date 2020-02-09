class Solution {
    public static int[][] cache; // 캐싱 테이블
    
    public int solution(int[][] triangle) {
        int answer = 0;
        
        // 캐싱 테이블 초기화
        cache = new int[triangle.length][];
        
        for(int i = 0 ; i < cache.length ; i++) {
        	cache[i] = new int[triangle[i].length];
        	
            for(int j = 0 ; j < cache[i].length ; j++) {
                cache[i][j] = -1;
            }
        }
        
        // 최댓값 계산
        answer = getMaxValue(triangle, 0, 0);
        
        return answer;
    }
    
    public int getMaxValue(int[][] triangle, int i, int j) {
        int root = triangle[i][j];
        int retVal = root;
        int left;
        int right;
        
        if(cache[i][j] != -1) {
            retVal = cache[i][j];
        }
        else {
            if(i < triangle.length - 1) {
                left = getMaxValue(triangle, (i + 1), j);
                right = getMaxValue(triangle, (i + 1), (j + 1));

                // 최대값 리턴
                if(left > right) {
                    retVal += left;
                }
                else {
                    retVal += right;
                }
            }
            
            cache[i][j] = retVal;
        }
        
        return retVal;
    }
}