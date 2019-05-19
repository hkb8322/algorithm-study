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
