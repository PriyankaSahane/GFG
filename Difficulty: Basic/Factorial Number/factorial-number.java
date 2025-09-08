// User function Template for Java

class Solution {
    static int isFactorial(int N) {
        // code here
        
        /*int i;
        for(i=1; n%i==0; i++){
            if(n/10==1){
                return n;
            }
            n=n/10;
        }
        return 0;*/
        int fact = 1;
        int n = 1;
        
        while(fact <= N){
            fact = fact * n;
            n++;
            if(fact == N){
                return 1;
            }
            
        }
        return 0;
    }
}