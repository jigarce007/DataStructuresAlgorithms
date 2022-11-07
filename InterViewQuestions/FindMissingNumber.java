
/*                                          PROBLEM STATEMENT
===================================================================================================================
- Given an array arr[] of size N-1 with integers in the range of [1, N],
the task is to find the missing number from the first N integers.

e.g,
INPUT
=============
Input: arr[] = {1, 2, 4, 6, 3, 7, 8}, N = 8
Output: 5
Explanation: The missing number between 1 to 8 is 5

OUTPUT
============
[6,2,3,1]

SOLUTION
=========
-Sum numbers from 1 to "N" - A
-Sum the elements of array - B
-Subtract A-B = Missing Number
*/

package InterViewQuestions;


public class FindMissingNumber
 {
public static void main(String[] args) {
    int[] ary = {1,2,3,4,5,12,14,8,10,11,6,13,7,15}; 
    
    missingNumber(ary,15);
}    
static void missingNumber(int[] ary,int n){
    int sumOfAry = 0;
    int sum = n*(n+1)/2;
    for (int i = 0; i < ary.length; i++) {
        sumOfAry +=ary[i]; 
    }
   
    System.out.println("Missing number is : "+(sum-sumOfAry));
}
}
