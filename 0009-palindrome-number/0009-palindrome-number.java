class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int n=x;
        int newn=0;
        while(n!=0){
            int k=n%10;
            newn=newn*10+k;
            n/=10;
        }
        return x==newn;
    }
}