/*
 * HackerRank - Divisible Sum Pairs
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
    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        int result = 0;
        
        for(int i = 0 ; i < ar.size() ; i++) {
            for(int j = i + 1 ; j < ar.size() ; j++) {
                if((ar.get(i) + ar.get(j)) % k == 0) {
                    result++;
                }
            }
        }
        
        return result;
    }
}