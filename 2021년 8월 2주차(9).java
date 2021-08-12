/*
 * HackerRank - Apple and Orange
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
    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        System.out.println(getCountFallOnHouse(s, t, a, apples));
        System.out.println(getCountFallOnHouse(s, t, b, oranges));
    }
    
    public static int getCountFallOnHouse(int s, int t, int treeLoct, List<Integer> fruits) {
        int result = 0;
        
        for(int fruit : fruits) {
            int fruitLoct = fruit + treeLoct;
            
            if(s <= fruitLoct && fruitLoct <= t) {
                result++;
            }
        }
        
        return result;
    }

}