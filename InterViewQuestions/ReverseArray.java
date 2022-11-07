
/*                                          PROBLEM STATEMENT
===================================================================================================================
- REVERSE THE ELEMENTS OF AN ARRAY
E   e.g,
INPUT
=============
[1,3,2,6]

OUTPUT
============
[6,2,3,1]

*/
package InterViewQuestions;

import java.util.Arrays;

public class ReverseArray
 {
public static void main(String[] args) {
   // System.out.println("Sum of Digits is = " +addDigits(1));
   ReverseArray rev = new ReverseArray();
   int[] intArray = {1,2,3,4,5,6,7};
   rev.revreseArray(intArray);

}    
//[1,3,5,4] == 11,13,15,14...31,33,35,34...so on
void revreseArray(int[] a){
    for (int i = 0; i < a.length/2; i++) { 
        int other = a.length-i-1;
        int temp = a[i];
        
        a[i] = a[other];
        a[other] = temp;
    }
    
    System.out.println(+a.length+""+"Reverse Array is  "+Arrays.toString(a));//------------O(1)
}
}
