
/*                                          PROBLEM STATEMENT
===================================================================================================================
Permutation
Your are given two integer arrays. Write a program to check if they are permutation of each other.

Example
============
int[] array1 = {1,2,3,4,5};
int[] array2 = {5,1,2,3,4};
permutation(array1, array2)
Output
============
true

*/

package InterViewQuestions;

public class PermutedArrays
 {
public static void main(String[] args) {
    int[] a = {1,4,3,2,5}; 
    int[] b = {1,2,3,4,5};
    
    System.out.println("Arrays are permuted ? = "+isPemuted(a,b));
    
}    
static boolean isPemuted(int[] a,int b[]){
    int result = 0;
    int[] flag_ary = new int[a.length];
    for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < b.length; j++) {
            if(a[i] == b[j]){
                flag_ary[i] = 1;
                result +=1;
            }
        }
       
    }
    if(result != a.length){
        return false;
    }       
   return true;

}

}
