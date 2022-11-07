
/*                                          PROBLEM STATEMENT
===================================================================================================================
Max Product of Two Integers
How to find maximum product of two integers in the array where all elements are positive.

Example

int[] intArray = {10,20,30,40,50};
maxProduct(intArray) // (40,50)

*/
package InterViewQuestions;

public class MaximumProductofElements
 {
public static void main(String[] args) {
   // System.out.println("Sum of Digits is = " +addDigits(1));
   MaximumProductofElements pairs = new MaximumProductofElements();
   int[] intArray = {99,20,30,40,50};
   System.out.println("Maxium product pair is == "+pairs.findMaxProduct(intArray));

}    
//[1,3,5,4] == 11,13,15,14...31,33,35,34...so on
String findMaxProduct(int[] a){
   int temp = 0;
   int result = 0;
   String pair = "";
  
    for (int i = 0; i < a.length; i++) { //----------- O(n)
        for (int j = i+1; j < a.length; j++) {//------------O(n)
            //System.out.println("Pair is "+a[i]+""+a[j]);//------------
            temp = a[i]*a[j]; // -------O(1)
            if(result<temp){ 
                result = temp; //-------O(1)
                pair = "["+Integer.toString(a[i])+","+Integer.toString(a[j])+"]";
            }
            
        }
    }
    return pair;
    //TIME COMPLEXITY == (O(N^2)) == as loop between loop
}
}
