/*
 * HackerRank - Climbing the Leaderboard
 */

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
        List<Integer> result = new ArrayList<>();
        TreeSet<Integer> treeSet = new TreeSet<>();
        TreeSet<Integer> descendingSet = null;
        HashMap<Integer, Integer> rankMap = new HashMap<>();
        Iterator iter = null;
        
        treeSet.addAll(ranked);
        descendingSet = (TreeSet<Integer>)treeSet.descendingSet();
        iter = descendingSet.iterator();
        
        int temp = 1;
        
        while(iter.hasNext()) {
            rankMap.put((Integer)iter.next(), temp++);
        }
        
        for(int i = 0 ; i < player.size() ; i++) {
            int score = player.get(i);
            int rank = 1;
            
            if(score < descendingSet.last()) {
                rank = descendingSet.size() + 1;
            } else if(score <= descendingSet.first()) {
                rank = rankMap.get(descendingSet.ceiling(score));
            }
            
            result.add(rank);
        }
        
        return result;
    }

}
