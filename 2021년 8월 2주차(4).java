/*
 * HackerRank - Migratory Birds
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
    public static int migratoryBirds(List<Integer> arr) {
        final int BIRD_TYPE_COUNT = 5;
        int[] index = new int[BIRD_TYPE_COUNT + 1];
        int result = 0;
        
        for(int type : arr) {
            index[type]++;
        }
        
        for(int i = 1, maxValue = 0 ; i < index.length ; i++) {
            if(index[i] > maxValue) {
                maxValue = index[i];
                result = i;
            }
        }
        
        return result;
    }

}