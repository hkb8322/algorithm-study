/*
 * HackerRank - The Time in Words
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
    public static String timeInWords(int h, int m) {
        String hour = "";
        String minute = "";
        String suffix = "";
        String result = "";
        
        hour = getTextOfNumber(m > 30 ? h + 1 : h);
        
        if(m > 0) {
            if(m > 30) {
                suffix = "to";
            } else {
               suffix = "past";
            }
            
            if(m % 15 == 0) {
                switch(m / 15) {
                    case 1:
                    case 3:
                        minute = "quarter";
                        break;
                    case 2:
                        minute = "half";
                        break;
                }
            } else {
                minute = getTextOfNumber(m > 30 ? (60 - m) : m) + " minute" + (m > 1 ? "s" : "");
            }
            
            result = String.join(" ", minute, suffix, hour);
        } else {
            result = hour + " o' clock";
        }
        
        return result;
    }
    
    public static String getTextOfNumber(int pNum) {
        String result = "";
        
        switch(pNum) {
            case 0:
            case 1:
                result = "one";
                break;
            case 2:
                result = "two";
                break;
            case 3:
                result = "three";
                break;
            case 4:
                result = "four";
                break;
            case 5:
                result = "five";
                break;
            case 6:
                result = "six";
                break;
            case 7:
                result = "seven";
                break;
            case 8:
                result = "eight";
                break;
            case 9:
                result = "nine";
                break;
            case 10:
                result = "ten";
                break;
            case 11:
                result = "eleven";
                break;
            case 12:
                result = "twelve";
                break;
            case 13:
                result = "thirteen";
                break;
            case 14:
                result = "fourteen";
                break;
            case 15:
                result = "fifteen";
                break;
            case 16:
                result = "sixteen";
                break;
            case 17:
                result = "seventeen";
                break;
            case 18:
                result = "eighteen";
                break;
            case 19:
                result = "nineteen";
                break;
            case 20:
                result = "twenty";
                break;
            case 30:
                result = "thirty";
                break;
            case 40:
                result = "fourty";
                break;
            case 50:
                result = "fifty";
                break;
            default:
                int n1 = pNum / 10;
                int n2 = pNum % (n1 * 10);
                result = getTextOfNumber(n1 * 10) + " " + getTextOfNumber(n2);
        }
        
        return result;
    }
}
