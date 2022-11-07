/*
 * PROBLEM STATEMENT
 * ==================
 * Pairs / Two Sum -
Write a program to find all pairs of integers whose sum is equal to a given number.

Examples
---------------------------------------
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1]
 * 
 * 
 */

package InterViewQuestions;

import java.util.Arrays;

public class PairsToSum
 {
public static void main(String[] args) {
    int[] intAry = {1,2,6,4,8,5,1,9,5};
     twoSum(intAry,10);
    
}    


public static void twoSum(int[] nums, int target) {
    // TODO
    int temp =0;
    int[] result = new int[2];
    for(int i=0;i<nums.length;i++){         //Time complexity = O(n)
        for(int j=i+1;j<nums.length;j++){  //Time complexity = O(n)
             temp = nums[i]+nums[j];         //Time comp = O(1)
        
            if(temp == target){
                result[0] = i; //Time comp = O(1)
                result[1] =j;//Time comp = O(1)
                System.out.println("Pair is = " +Arrays.toString(result));//Time comp = O(1)
               
            }
        }
    }
   
}
 }

