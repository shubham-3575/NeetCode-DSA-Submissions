class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char ch = board[i][j];
                if(ch != '.'){
                    String row = "row"+ch+"in"+i;
                    String col = "col"+ch+"in"+j;
                    String box = "box"+ch+"in"+(i/3)+"-"+(j/3);
                    if(!seen.add(row)||!seen.add(col)||!seen.add(box))
                    return false;
                }
            }
        }
        return true;
    }
}
