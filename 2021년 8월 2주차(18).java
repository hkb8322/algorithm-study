/*
 * HackerRank - Absolute Permutation (Algorithms > Implementation)
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

    public static List<Integer> absolutePermutation(int n, int k) {
        List<Integer> result = new ArrayList<>();
        
        if(k == 0) {
            for(int i = 1 ; i <= n ; i++) {
                result.add(i);
            }
        } else if(n % (2 * k) == 0) {
            for(int i = 1 ; i <= n ; i++) {
                result.add(i + k);
                
                if(i % k == 0) {
                    k *= -1;
                }
            }
        } else {
            result.add(-1);
        }
        
        return result;
    }

}