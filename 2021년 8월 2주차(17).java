/*
 * HackerRank - Non-Divisible Subset (Algorithms > Implementation)
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
    public static int nonDivisibleSubset(int k, List<Integer> s) {
        int result = 0;
        int[] remainder = new int[k];
        
        for(int i = 0 ; i < s.size() ; i++) {
            remainder[s.get(i) % k]++;
        }
        
        for(int i = 1 ; i <= k / 2 ; i++) {
            if(i != k - i) {
                result += Math.max(remainder[i], remainder[k - i]);
            } else {
                result += Math.min(remainder[i], 1);
            }
        }
        
        result += Math.min(remainder[0], 1);
        
        return result;
    }

}
