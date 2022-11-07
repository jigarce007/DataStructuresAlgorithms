/*
 * PROBLEM STATEMENT
 * ==================
 * Finding a Number in an Array
Write a program to to check if an array contains a number in Java.

int[] intArray = {1,2,3,4,5,6};





searchInArray(intArray, 6); // At index of 5

 */

package InterViewQuestions;

public class FindingANumberInArray
 {
public static void main(String[] args) {
    int[] intAry = {1,2,6,4,8,5,9};
    
    
    System.out.println("Number found at index -> "+searchInArray(intAry,5));
    
}    

public static int searchInArray(int[] intArray,int valueToSearch) {
    // TODO
    int result=0;
    for (int i = 0; i < intArray.length; i++) {
        if(intArray[i] == valueToSearch){
            result =i;
        }
    }

    return result;
}
}
 

