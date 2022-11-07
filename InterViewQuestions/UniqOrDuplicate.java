
/*                                          PROBLEM STATEMENT
===================================================================================================================
-IsUnique / Contains Duplicate - LeetCode 217
Write a program to check if an array is unique or not.

Example

int[] intArray = {1,2,3,4,5,6};
isUnique(intArray) // true

*/

package InterViewQuestions;


public class UniqOrDuplicate
 {
public static void main(String[] args) {
    int[] ary = {1,4,12,6}; 
    System.out.println("Array contains Uniq elements? = "+isUniq(ary));
    
}    
static boolean isUniq(int[] ary){
    boolean flag = false;
    for (int i = 0; i < ary.length; i++) {
        for (int j = i+1; j < ary.length; j++) {
            if(ary[i] == ary[j]){
               flag = true;
                break;
          
            }
        }
        
    }
   
   return flag;
}
}
