/*
스트리밍 사이트에서 장르 별로 가장 많이 재생된 노래를 두 개씩 모아 베스트 앨범을 출시하려 합니다. 노래는 고유 번호로 구분하며, 노래를 수록하는 기준은 다음과 같습니다.

속한 노래가 많이 재생된 장르를 먼저 수록합니다.
장르 내에서 많이 재생된 노래를 먼저 수록합니다.
장르 내에서 재생 횟수가 같은 노래 중에서는 고유 번호가 낮은 노래를 먼저 수록합니다.
노래의 장르를 나타내는 문자열 배열 genres와 노래별 재생 횟수를 나타내는 정수 배열 plays가 주어질 때, 베스트 앨범에 들어갈 노래의 고유 번호를 순서대로 return 하도록 solution 함수를 완성하세요.

제한사항
genres[i]는 고유번호가 i인 노래의 장르입니다.
plays[i]는 고유번호가 i인 노래가 재생된 횟수입니다.
genres와 plays의 길이는 같으며, 이는 1 이상 10,000 이하입니다.
장르 종류는 100개 미만입니다.
장르에 속한 곡이 하나라면, 하나의 곡만 선택합니다.
모든 장르는 재생된 횟수가 다릅니다.
입출력 예
genres	plays	return
[classic, pop, classic, classic, pop]	[500, 600, 150, 800, 2500]	[4, 1, 3, 0]
입출력 예 설명
classic 장르는 1,450회 재생되었으며, classic 노래는 다음과 같습니다.

고유 번호 3: 800회 재생
고유 번호 0: 500회 재생
고유 번호 2: 150회 재생
pop 장르는 3,100회 재생되었으며, pop 노래는 다음과 같습니다.

고유 번호 4: 2,500회 재생
고유 번호 1: 600회 재생
따라서 pop 장르의 [4, 1]번 노래를 먼저, classic 장르의 [3, 0]번 노래를 그다음에 수록합니다.
*/

import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        int[] answer;
        Map<String, Integer> map = new HashMap<>();
        List<String> sortedMap = null;

        // 1) 장르별 재생 횟수 비교 및 재생 횟수 순 정렬
        for(int i = 0 ; i < genres.length ; i++) {
            if(map.get(genres[i]) != null) {
                map.put(genres[i], map.get(genres[i]) + plays[i]);
            }
            else {
                map.put(genres[i], plays[i]);
            }
        }

        sortedMap = new ArrayList<>(map.keySet());
        Collections.sort(sortedMap, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int result;

                if(map.get(o1) >= map.get(o2)) {
                    result = -1;
                }
                else {
                    result = 1;
                }

                return result;
            }
        });

        // 2) 장르별 노래 수록
        ArrayList tmp = new ArrayList();
        for(int i = 0 ; i < sortedMap.size() ; i++){
            Map<String, Integer> addSong = new HashMap<>();

            // 노래 선정
            for(int j = 0 ; j < genres.length ; j++) {
                if(genres[j].equals(sortedMap.get(i))) {
                    if(addSong.get("max") != null) {
                        if(plays[addSong.get("max")] < plays[j]) {
                            addSong.put("maxSecond", addSong.get("max"));
                            addSong.put("max", j);
                        }
                        else {
                            if(addSong.get("maxSecond") != null) {
                                if(plays[addSong.get("maxSecond")] < plays[j]) {
                                    addSong.put("maxSecond", j);
                                }
                            }
                            else {
                                addSong.put("maxSecond", j);
                            }
                        }
                    }
                    else {
                        addSong.put("max", j);
                    }
                }
            }

            for( String key : addSong.keySet() ){
                tmp.add(addSong.get(key));
            }
        }

        answer = new int[tmp.size()];
        for (int i = 0 ; i < tmp.size() ; i++) {
            answer[i] = (int)(tmp.get(i));
        }

        return answer;
    }
}
