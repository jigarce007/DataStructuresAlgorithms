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
public class PairsToSum
 {
public static void main(String[] args) {
    int[] intAry = {1,2,6,4,8,5,1,9,5};
    //System.out.println("Pair is = " +Arrays.toString(twoSum(intAry,10)));
    int[] temp = twoSum(intAry,10);
}    

public static int[] twoSum(int[] nums, int target) {
    // TODO
    int temp =0;
    int[] result = new int[nums.length];
    for(int i=0;i<nums.length;i++){         //Time complexity = O(n)
        for(int j=i+1;j<nums.length;j++){  //Time complexity = O(n)
             temp = nums[i]+nums[j];         //Time comp = O(1)
        
            if(temp == target){
                result[i] = i+1; //Time comp = O(1)
                result[j] =j+1;//Time comp = O(1)
                System.out.println("Pair is = ["+i+ ","+j+"]");//Time comp = O(1)
            }
        }
    }
    
    return result;
}
}
