
/*                                          PROBLEM STATEMENT
===================================================================================================================
- FIND GCD OF TWO NUMBERS
E   e.g,
INPUT
=======
A=12 -->1,2,3,4,12
B=48 -->1,2,3,4,6,8,12

So here as we can see among all tge divisors "12" is the common biggest divisor.which is called
Greatest Common Divisor(GCM)

OUTPUT
=======


                                            RECURSION LOGIC
                                        ======================
n = 48 and m = 18 -->Reminder = 12
n = 18 and m = 12 -->Reminder = 6
n = 12 and m = 6 -->Reminder = 0
n = 6 and m = 0 -->Reminder = 0
  
So here "6" is GCD

*/

public class GCDNumber
 {
public static void main(String[] args) {
    System.out.println("Greatest Common Divisor is= " +findGCM(120,45));
}    
static int findGCM(int n,int m){
    int gcd;
    
    if(m==0){
        return n;
    }
    gcd = findGCM(m, n%m);
    return gcd;
}
}
