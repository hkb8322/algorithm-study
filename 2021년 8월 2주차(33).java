/*
 * HackerRank - Waiter (Data Structures > Stack)
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

    public static List<Integer> waiter(List<Integer> number, int q) {
        List<Integer> result = new ArrayList<>();
        Stack<Integer> stackNumber = new Stack<>();
        int[] primeNumbers = new int[q];
        
        stackNumber.addAll(number);
        Collections.reverse(stackNumber);
        
        // get {q} prime number
        for(int i = 0, temp = 1 ; i < q ; i++) {
            for(int j = temp + 1 ; ; j++) {
                boolean bPrime = true;
                
                for(int k = 2 ; k * k <= j ; k++) {
                    if(j % k == 0)  {
                        bPrime = false;
                        break;
                    }
                }
                
                if(bPrime) {
                    temp = j;
                    primeNumbers[i] = temp;
                    break;
                }
            }
        }
        
        // iteration
        for(int i = 0 ; i < q ; i++) {
            Stack<Integer> stackA = new Stack<>();
            Stack<Integer> stackB = new Stack<>();
            
            while(!stackNumber.isEmpty()) { 
                int n = stackNumber.pop();
                
                if(n % primeNumbers[i] == 0) {
                    result.add(n);
                } else {
                    stackA.push(n);
                }
            }
            
            if(i == q - 1) {
                result.addAll(stackA);
            } else {
                stackNumber = stackA;
            }
        }
        
        
        return result;
    }

}