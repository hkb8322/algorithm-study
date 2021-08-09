/*
 * HackerRank - Extra Long Factorials
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

    /*
     * Complete the 'extraLongFactorials' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void extraLongFactorials(int n) {
        BigInteger iResult = getIntToBigInteger(1);
        
        for(int i = n ; i >= 1 ; i--) {
            iResult = iResult.multiply(getIntToBigInteger(i));
        }
        
        System.out.println(iResult);
    }
    
    public static BigInteger getIntToBigInteger(int n) {
        return BigInteger.valueOf(Long.valueOf(n));
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.extraLongFactorials(n);

        bufferedReader.close();
    }
}
