class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> hs=new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.') continue;
                char num=board[i][j];
                String r=num+" row "+i;
                String c=num+" col "+j;
                String box=num+"in box"+(i/3)+'-'+(j/3);
                if(!hs.add(r) || !hs.add(c) || !hs.add(box)) return false;
            }
        }
        return true;
    }
}