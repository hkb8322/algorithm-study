/*
 * HackerRank - Bigger is Greater
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
    public static String biggerIsGreater(String w) {
        char[] strArr = w.toCharArray();
        char[] sortArr = null;
        int[] changeIdx = {-1, -1}; // swap char, swap target char
        
        // find smallest swap target index
        for(int i = strArr.length - 1 ; i >= 0 ; i--) {
            for(int j = i - 1 ; j >= 0 ; j--) {
                if(strArr[i] > strArr[j] && changeIdx[1] < j) {
                    changeIdx[0] = i;
                    changeIdx[1] = j;
                    break;
                }
            }
        }
        
        if(changeIdx[0] > -1) {
            // swap
            char c = strArr[changeIdx[1]];
            strArr[changeIdx[1]] = strArr[changeIdx[0]];
            strArr[changeIdx[0]] = c;
            
            // sort
            sortArr = Arrays.copyOfRange(strArr, changeIdx[1] + 1, strArr.length);
            
            Arrays.sort(sortArr);
            
            // create new string
            for(int i = changeIdx[1] + 1, j = 0 ; i < strArr.length ; i++, j++) {
                strArr[i] = sortArr[j];
            }
            
            return String.valueOf(strArr);
        } else {
            return "no answer";
        }
    }

}