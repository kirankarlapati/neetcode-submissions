class Solution {
    public int trap(int[] a) {
        int l=0,lmax=0,rmax=0,n=a.length,r=n-1;
        int water=0;
        while(l<=r){
            if(a[l]>=a[r]){
                if(a[r]>rmax) rmax=a[r];
                else water+=rmax-a[r];
                r--;
            } else {
                if(a[l]>lmax) lmax=a[l];
                else water+=lmax-a[l];
                l++;
            }
        }
        return water;
    }
}
