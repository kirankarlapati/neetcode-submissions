class Solution {
    public int mirrorDistance(int n) {
        int rev=0,org=n;
        while(n!=0){
            int x=n%10;
            rev=(rev*10)+x;
            n/=10;
        }
        return Math.abs(org-rev);
    }
}