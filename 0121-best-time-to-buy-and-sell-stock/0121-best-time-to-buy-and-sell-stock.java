class Solution {
    public int maxProfit(int[] a) {
        int min=a[0],max=0;
        for(int i=0;i<a.length;i++){
            if(a[i]<min) min=a[i];
            else max=Math.max(max,a[i]-min);
        }
        return max;
    }
}