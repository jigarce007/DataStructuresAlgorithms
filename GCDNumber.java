public class GCDNumber
 {
public static void main(String[] args) {
    System.out.println("Greatest Common Divisor is= " +findGCM(48,12));
}    
static int findGCM(int n,int m){
    int gcm;
    
    if(n == m){   
        return n;
    }
    if(n ==0 || m ==0){
        return n;
    }
    if(n==1){
        return n;
    }
    if(m==1){
        return m;
    }
    int r = n%m;
    gcm = findGCM(m, r);
    
    return gcm;
}
}
