/*
 * HackerRank - Compare the Triplets
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
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> result = new ArrayList<>();
        
        result.add(0); // alice
        result.add(0); // bob
        
        for(int i = 0 ; i < a.size() ; i++) {
            if(a.get(i) > b.get(i)) {
                result.set(0, result.get(0) + 1);
            } else if(a.get(i) < b.get(i)) {
                result.set(1, result.get(1) + 1);
            }
        }
        
        return result;
    }

}