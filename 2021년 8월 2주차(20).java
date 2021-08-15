/*
 * HackerRank - Plus Minus (Algorithms > Warmup)
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

    public static void plusMinus(List<Integer> arr) {
        int[] countArr = new int[3];
        
        for(int number : arr) {
            if(number > 0) {
                countArr[0]++; // plus
            } else if(number < 0) {
                countArr[1]++; // minus
            } else {
                countArr[2]++; // zero
            }
        }
        
        for(int count : countArr) {
            System.out.println(String.format("%.6f",  (double)count / arr.size()));
        }

    }

}