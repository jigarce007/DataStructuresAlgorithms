
/*                                          PROBLEM STATEMENT
===================================================================================================================
- RETURN AN ARRAY OF PAIRS FROM THE GIVEN ARRAY OF INTEGER...
E   e.g,
INPUT
=============
int[] intArray = {1,3,2,6}

Problem Explaination : From the given integer array we need to make pairs of elements from the array and retuns
pairs.

As stated in the below output here is the complete set of pairs from the given number of elements 
from the input array of integer.
OUTPUT
============
11,13,12,16,31,33,32,36,21,23,22,26,61,63,62,66

*/
package InterViewQuestions;

public class FindPairs
 {
public static void main(String[] args) {
   // System.out.println("Sum of Digits is = " +addDigits(1));
   FindPairs pairs = new FindPairs();
   int[] intArray = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
   pairs.findPairs(intArray);

}    
//[1,3,5,4] == 11,13,15,14...31,33,35,34...so on
void findPairs(int[] a){
   
    for (int i = 0; i < a.length; i++) { //----------- O(n)
        for (int j = 0; j < a.length; j++) {//------------O(n)
            System.out.println("Pair is "+a[i]+""+a[j]);//------------O(1)
        }
    }
    
    //TIME COMPLEXITY == (O(N^2)) == as loop between loop
}
}
