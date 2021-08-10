import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        List<Integer> result = new ArrayList<>(player.size());
        HashSet<Integer> hashSet = new HashSet<>(ranked);
        List<Integer> arrayList = new ArrayList<>(hashSet);
        
        Collections.sort(arrayList, Collections.reverseOrder());
        
        for(int i = 0 ; i < player.size() ; i++) {
            result.add(binarySearch(arrayList, player.get(i), 0, arrayList.size() - 1));
        }
        
        return result;
    }
    
    public static int binarySearch(List<Integer> arrayList, int target, int start, int end) {
        if(start > end){
            return start + 1;
        } else if(start >= arrayList.size())  {
            return arrayList.size() + 1;
        } else {
            int mid = (start + end) / 2;
            
            if(arrayList.get(mid) == target) {
                return mid + 1;
            } else if(arrayList.get(mid) < target) {
                return binarySearch(arrayList, target, start, mid - 1);
            } else {
                return binarySearch(arrayList, target, mid + 1, end);
            }
        }
    }
}