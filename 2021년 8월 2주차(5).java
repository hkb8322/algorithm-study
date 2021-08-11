/*
 * HackerRank - Day of the Programmer
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
    public static String dayOfProgrammer(int year) {
        final int DAY_OF_PROGRAMMER = 256;
        int[] dayOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int daySum = 0;
        int month = 0;
        
        // leap year
        if((year <= 1917 && year % 4 == 0) || (year >= 1919 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))) {
            dayOfMonth[1]++;
        } else if(year == 1918) {
            dayOfMonth[1] -= 13;
        }
        
        for(int i = 0 ; i < dayOfMonth.length ; daySum += dayOfMonth[i], i++) {
            if(daySum + dayOfMonth[i] > DAY_OF_PROGRAMMER) {
                month = i;
                break;
            }
        }
        
        SimpleDateFormat dtFormat = new SimpleDateFormat("dd.MM.yyyy");
        Calendar cal = Calendar.getInstance();
        
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month);
        cal.set(Calendar.DATE, DAY_OF_PROGRAMMER - daySum);
        
        return dtFormat.format(cal.getTime());
    }

}