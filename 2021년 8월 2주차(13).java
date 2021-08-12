/*
 * HackerRank - Organizing Containers of Balls
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
    public static String organizingContainers(List<List<Integer>> container) {
        int n = container.size();
        int sumByType[] = new int[n];
        int sumByContainer[] = new int[n];
        
        for(int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j < n ; j++) {
                sumByType[i] += container.get(i).get(j);
                sumByContainer[i] += container.get(j).get(i);
            }
        }
        
        Arrays.sort(sumByType);
        Arrays.sort(sumByContainer);

        for(int i = 0 ; i < n ; i++) {
            if(sumByType[i] != sumByContainer[i]) {
                return "Impossible";
            }
        }
        
        return "Possible";
    }

}