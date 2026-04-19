class Solution {
    public int evalRPN(String[] a) {
         Stack<Integer> st=new Stack<>();
        for(String s:a){
            if(s.equals("+")) st.push(st.pop()+st.pop());
            else if(s.equals("-")){
                int x=st.pop();
                st.push(st.pop()-x);
            } else if(s.equals("*")) st.push(st.pop()*st.pop());
            else if(s.equals("/")){
                int x=st.pop();
                st.push(st.pop()/x);
            } else st.push(Integer.parseInt(s));
        }
        return st.peek();
    }
}
