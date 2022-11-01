public class AddDigits
 {
public static void main(String[] args) {
    System.out.println("Sum of Digits is = " +addDigits(123456789));
}    
static int addDigits(int n ){
    int sum;
    if(n<0){
        return 0;
    }

    if(n<10){return n;}

    sum = n%10 + addDigits(n/10);
    return sum;
}
}
