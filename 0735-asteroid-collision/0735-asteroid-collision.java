class Solution {
    public int[] asteroidCollision(int[] a) {
        Stack<Integer> st=new Stack<>();
        for(int x:a){
            if(x>0) st.push(x);
            else{
                while(!st.isEmpty() && st.peek()>0 && st.peek()<-x) st.pop();
                if(st.isEmpty() || st.peek()<0) st.push(x);
                else if(st.peek()==-x) st.pop();
            }
        }
        int[] r=new int[st.size()];
        for(int i=st.size()-1;i>=0;i--) r[i]=st.pop();
        return r;  
    }
}