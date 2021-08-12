/*
 * HackerRank - Ice Cream Parlor
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
	
    public static List<Integer> icecreamParlor(int m, List<Integer> arr) {
        List<Integer> result = new ArrayList<>();
        
        for(int i = 0 ; i < arr.size() ; i++) {
            int cost = arr.get(i);
            int index = 0;
            
            index = arr.indexOf(m - cost);
            
            if(index > -1 && index != i) {
                result.add(i + 1);
                result.add(index + 1);
                break;
            }
        }
        
        Collections.sort(result);
        
        return result;
    }

}