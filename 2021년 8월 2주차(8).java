/*
 * HackerRank - Picking Numbers
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

    public static int pickingNumbers(List<Integer> a) {
        int result = 0;
        
        Set<Integer> set = new TreeSet<>();
        Iterator iter = null;
        
        set.addAll(a);
        iter = set.iterator();
        
        while(iter.hasNext()) {
            int number = (int)iter.next();
            int compareNumber[] = new int[2];
            int count = 0;
            
            count += Collections.frequency(a, number);
            
            compareNumber[0] = Collections.frequency(a, number - 1);
            compareNumber[1] = Collections.frequency(a, number + 1);
                
            count += compareNumber[0] >= compareNumber[1] ? compareNumber[0] : compareNumber[1];
            
            if(count > result) {
                result = count;
            }
        }
        
        
        return result;
    }

}
