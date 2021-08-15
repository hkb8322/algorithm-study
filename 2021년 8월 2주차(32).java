/*
 * HackerRank - Cycle Detection (Data Structures > Liked Lists)
 */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the hasCycle function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static boolean hasCycle(SinglyLinkedListNode head) {
        List<SinglyLinkedListNode> visitedNode = new ArrayList<>();
        boolean result = false;
        
        while(head.next != null) {            
            if(visitedNode.indexOf(head) > -1) {
                result = true;
                break;
            }  else {
                visitedNode.add(head);
                
                head = head.next;
            }
        }

        return result;
    }
}
