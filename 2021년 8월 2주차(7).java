/*
 * HackerRank - Drawing Book
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
    public static int pageCount(int n, int p) {
        int start = p / 2;
        int end = ((n + (n % 2 == 0 ? 1 : 0)) - p) / 2;
        
        return (start < end ? start : end);
    }

}