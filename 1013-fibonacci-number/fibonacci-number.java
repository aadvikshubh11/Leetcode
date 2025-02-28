class Solution {
    public int fib(int n) {
        if(n==0) {
            return 0;
        }
        if(n==1){
            return 1;
        }
        int firstTerm = 0;
        int secTerm = 1;
        int sum = 0;
        for(int i=2; i<=n; i++){
            sum = firstTerm + secTerm;
            firstTerm = secTerm;
            secTerm = sum;
        }
        return sum;

    }
}