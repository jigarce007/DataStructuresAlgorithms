/*                                          PROBLEM STATEMENT
- FIND THE POWER A NUMBER
E   e.g,
INPUT
=======
2 power of 5 = 2×2×2×2×2 

OUTPUT
=======
32

                                            RECURSION LOGIC
                                        ======================
                                *P will starts with 4 ---> p-1
                                * 4 x 2(4) = 8
                                * 8 x 2(3) = 16
                                * 16 x 2(2) = 32
                                * 32 x 2(1) = 64 
        
*/


class PowerOfNumber{
   public static void main(String args[]){

    //soln is power of a number. 
    //here...5 power of 2 ===> 32
    int soln = getpower(2, 5);
    System.out.println("Power value of a number is = "+soln);

    }

    //n = number and p = power
    static int getpower(int n,int p){
        int power;
        if(p == 0){
            return 0;
        }

        if(p == 1){
          return n;
        }
        
        power = n * getpower(n,p-1);
        p--;
        return power;
    }
}