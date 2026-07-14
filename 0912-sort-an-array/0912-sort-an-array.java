class Solution {
    public int[] sortArray(int[] nums) {
        // sort(nums,0,nums.length-1);
        Arrays.sort(nums);
        return nums;
    }
    public void sort(int a[],int low,int high){
        if(low>=high) return;
        int piv=partition(a,low,high);
        sort(a,low,piv-1);
        sort(a,piv+1,high);
    }
    public int partition(int[] a,int low,int high){
        int piv=a[low];
        int i=low+1,j=high;
        while(true){
            while(i<=high && piv>=a[i]) i++;
            while(piv<a[j]) j--;
            if(i>=j) break;
            swap(i,j,a);
         //5 3 6 7 1 2 9   
        }
        swap(low,j,a);
        return j;
    }
    public void swap(int x,int y,int[] a){
        int temp=a[x];
        a[x]=a[y];
        a[y]=temp;
    }
}