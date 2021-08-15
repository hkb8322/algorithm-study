/*
 * HackerRank - Jesse and Cookies (Data Structures > Heap)
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
    
    public static int cookies(int k, List<Integer> A) {
        int result = 0;
        PriorityQueue<Integer> cookies = new PriorityQueue<>();
        
        for(int i : A) {
            cookies.add(i);
        }
        
        while(cookies.peek() < k) {
            if(cookies.size() < 2) {
                result = -1;
                break;
            } else {
                cookies.add(cookies.poll() + cookies.poll() * 2);
                result++;
            }
        }
        
        return result;
    }

}