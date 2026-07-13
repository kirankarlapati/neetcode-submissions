class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=1;i<=9;i++){
            int x=0;
            for(int j=i;j<=9;j++){
                x=x*10+j;
                if(x>=low && x<=high) al.add(x);
            }
        }
        Collections.sort(al);
        return al;
    }
}