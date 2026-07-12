class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] sor=arr.clone();
        HashMap<Integer,Integer> hm=new HashMap<>();
        Arrays.sort(sor);
        int r=1;
        for(int i=0;i<arr.length;i++) if(!hm.containsKey(sor[i])) hm.put(sor[i],r++);
        for(int i=0;i<arr.length;i++) arr[i]=hm.get(arr[i]);
        return arr;
    }
}