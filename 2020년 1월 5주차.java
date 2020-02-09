import java.util.*;

class Solution {
    public int solution(int[][] routes) {
        int answer = 1;
        int camera;
        
        // 진입지점 기준 내림차순
        Arrays.sort(routes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return  o2[0] - o1[0];
            }
        });
        
        // 초기값 세팅
        camera = routes[0][0];
        
        // 단속카메라 개수 계산
        for(int i = 1 ; i < routes.length ; i++) {
            // 이전 진입구간이 현재 이동 경로에 포함되어 있지 않은 경우
            if(!(routes[i][0] <= camera && camera <= routes[i][1])) {
                answer++;
                camera = routes[i][0];
            }
        }
        
        return answer;
    }
}