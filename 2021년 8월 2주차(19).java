/*
 * HackerRank - Simple Array Sum (Algorithms > Warmup)
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
    public static int simpleArraySum(List<Integer> ar) {
        int result = 0;
        
        for(int i = 0 ; i < ar.size() ; i++) {
            result += ar.get(i);
        }
        
        return result;
    }

}