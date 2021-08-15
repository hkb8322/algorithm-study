/*
 * HackerRank - Is This a Binary Search Tree? (Data Structures > Trees)
 */

/* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.  

The Node class is defined as follows:
    class Node {
        int data;
        Node left;
        Node right;
     }
*/
    boolean checkBST(Node root) {
        return checkBSTHelper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    boolean checkBSTHelper(Node node, int minValue, int maxValue) {
        if(node == null) {
            return true;
        } else if(node.data <= minValue || node.data >= maxValue){
            return false;
        } else {
            return checkBSTHelper(node.left, minValue, node.data) && checkBSTHelper(node.right, node.data, maxValue);
        }
    }