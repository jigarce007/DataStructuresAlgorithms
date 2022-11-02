
/*                                          PROBLEM STATEMENT
===================================================================================================================
- FIND BINARY OF A NUMBER
E   e.g,
INPUT
=======
A=10 --> 1010

SOLUTION
Divide number with "2" get its Quotent and reminder.
then dived quotent with  2 and so on

Here,
 Number  |  Quotnent  | Reminder
 10/2    |      5     |     0     
 5/2     |      2     |     1
 2/2     |      1     |     0
 1/2     |      0     |     1     

 So from Reminders binary number will be down to up = 1010

Formula = n%2 + 10 * (n/2)
OUTPUT
=======
1010

*/

public class FindBinary
 {
public static void main(String[] args) {
    System.out.println("Binary of Number is = " +getBinary(10));
}    
static int getBinary(int n){
    int bin;
   
    if(n == 0 || n==1){
        return n;
    }

    bin = n%2 + 10 * getBinary(n/2);
    n = n/2;
    
    return bin;
}
}
