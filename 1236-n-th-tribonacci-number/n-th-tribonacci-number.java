class Solution {
   // 28 feb 2024
    public int tribonacci(int n) {
        if(n==0){
            return 0;
        }else if(n==1 || n==2) {
            return 1;
        }else {
            int firstTerm = 0;
            int secTerm = 1;
            int thirdTerm = 1;
            int sum = 0;
            for(int i=1; i<=n; i++) {
                sum = firstTerm + secTerm + thirdTerm;
                firstTerm = secTerm;
                secTerm = thirdTerm;
                thirdTerm = sum;
            } return firstTerm;
        }
    }
}