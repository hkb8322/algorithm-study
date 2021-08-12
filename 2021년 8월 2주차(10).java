/*
 * HackerRank - Time Conversion
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
    public static String timeConversion(String s) {
        SimpleDateFormat inputFormat = new SimpleDateFormat("hh:mm:ssaa");
        SimpleDateFormat outputFormat = new SimpleDateFormat("HH:mm:ss");
        Date date = null;
        
        try {
            date = inputFormat.parse(s);
        } catch(ParseException ex) {
            System.out.println("ERROR");
        }
        
        return outputFormat.format(date);
    }

}