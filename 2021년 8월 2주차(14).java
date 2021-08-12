/*
 * HackerRank - 3D Surface Area
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
    public static int surfaceArea(List<List<Integer>> A) {
        int result = 0;
        int height = A.size();
        int width = A.get(0).size();
        int[][] direction = {
          {0, -1},
          {0, 1},
          {-1, 0},
          {1, 0}  
        };
        
        // top, bottom
        result += height * width * 2;
        
        // side
        for(int i = 0 ; i < height; i++) {
            for(int j = 0 ; j < width ; j++) {
                for(int k = 0 ; k < direction.length ; k++) {
                    int nx = i + direction[k][0];
                    int ny = j + direction[k][1];
                    
                    if(0 <= nx && nx < height && 0 <= ny && ny < width) {
                        if(A.get(i).get(j) > A.get(nx).get(ny)) {
                            result += A.get(i).get(j) - A.get(nx).get(ny);
                        }
                    } else {
                        result += A.get(i).get(j);
                    }
                }
            }
        }
        
        return result;
    }

}