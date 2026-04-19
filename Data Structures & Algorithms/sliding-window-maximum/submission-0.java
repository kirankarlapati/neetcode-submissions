class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayDeque<Integer> dq=new ArrayDeque<>();
        int n=nums.length;
        int ret[]=new int[n-k+1];
        int x=0;
        for(int i=0;i<n;i++){
            //remove the leaving element 
            if(!dq.isEmpty() && dq.peekFirst()==i-k) dq.pollFirst();
            //maintain the monotonicity
            while(!dq.isEmpty() && nums[dq.peekLast()]<=nums[i]) dq.pollLast();
            //update with the new element
            dq.addLast(i);
            //add the element to the arr
            if(i>=k-1) ret[x++]=nums[dq.peekFirst()];
        }
        return ret;
    }
}
