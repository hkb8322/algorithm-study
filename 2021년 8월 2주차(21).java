/*
 * HackerRank - Diagonal Difference (Algorithms > Warmup)
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

    public static int diagonalDifference(List<List<Integer>> arr) {
        int leftDiagonal = 0;
        int rightDiagonal = 0;
        int maxIndex = arr.size() - 1;
        
        for(int i = 0 ; i <= maxIndex ; i++) {
            leftDiagonal += arr.get(i).get(i);
            rightDiagonal += arr.get(i).get(maxIndex - i);
        }
        
        return Math.abs(leftDiagonal - rightDiagonal);
    }

}
