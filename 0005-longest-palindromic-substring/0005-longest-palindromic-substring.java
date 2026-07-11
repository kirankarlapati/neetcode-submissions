class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        int x=0,y=1;
        boolean[][] dp=new boolean[n][n];
        for(int i=n-1;i>=0;i--){
            dp[i][i]=true;
            for(int j=i+1;j<n;j++){
                if(s.charAt(i)==s.charAt(j)){
                    if(j-i<=2) dp[i][j]=true;
                    else dp[i][j]=dp[i+1][j-1];
                    if(dp[i][j] && j-i+1>y){
                        x=i;
                        y=j-i+1;
                    }
                }
            }
        }
        return s.substring(x,x+y);
    }
}