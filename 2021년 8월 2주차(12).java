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
    public static String encryption(String s) {
        String removeSpaceStr = s.replaceAll(" ", "");
        double sqrtVal = Math.sqrt(removeSpaceStr.length());
        int row = (int)Math.floor(sqrtVal);
        int col = (int)Math.ceil(sqrtVal);
        String[] strArr = new String[col];
        
        Arrays.fill(strArr, "");
        
        if(row * col < removeSpaceStr.length()) {
            row += 1;
        }
        
        for(int i = 0 ; i < row ; i++) {
            int start = i * col;
            int end = (i + 1) * col;
            String tempStr;
            
            if(end > removeSpaceStr.length()) {
                end = removeSpaceStr.length();
            }
            
            tempStr = removeSpaceStr.substring(start, end);
            
            for(int j = 0 ; j < strArr.length ; j++) {
                if(j < tempStr.length()) {
                    strArr[j] += tempStr.charAt(j);
                } else {
                    break;
                }
            }
        }
        
        return String.join(" ", strArr);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.encryption(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
