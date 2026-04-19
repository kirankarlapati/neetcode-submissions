class Solution {
    public boolean searchMatrix(int[][] a, int target) {
        int r=a.length,c=a[0].length;
        int l=0,h=r*c-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            int row=mid/c,col=mid%c;
            if(a[row][col]==target) return true;
            else if(a[row][col]<target) l=mid+1;
            else h=mid-1;
        }
        return false;
    }
}
