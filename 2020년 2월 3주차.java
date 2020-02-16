/*
 * https://programmers.co.kr/learn/courses/30/lessons/42898
 */

class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int[][] map = new int[n + 1][m + 1];
        
        // 웅덩이 초기화
        for(int i = 0 ; i < puddles.length ; i++) {
            map[puddles[i][1]][puddles[i][0]] = -1;
        }
        
        // 시작점 초기화
        map[1][1] = 1;
        
        // 경로 계산 (우측, 하향으로만 이동)
        for(int i = 1 ; i <= n ; i++) {
            for(int j = 1 ; j <= m ; j++) {
                // 현재 위치가 웅덩이인 경우 건너뜀
                if(map[i][j] == -1) {
                    continue;   
                }
                
                // 하향으로 이동한 경우, 윗 칸이 웅덩이가 아닌 경우 경로 합산
                if(i > 1 && map[i - 1][j] != -1) {
                    map[i][j] += map[i - 1][j] % 1000000007;
                }
                
                // 우측으로 이동한 경우, 왼쪽 칸이 웅덩이가 아닌 경우 경로 합산
        		if(j > 1 && map[i][j - 1] != -1) {
                    map[i][j] += map[i][j - 1] % 1000000007;
                }
            }
        }
        
        return (map[n][m] % 1000000007);
    }
}