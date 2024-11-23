class Solution {
    public char[][] rotateTheBox(char[][] box) {
        char[][] res = new char[box[0].length][box.length];
        for(int row=0;row<box.length;row++){
            char[] arr = box[row];
            int rCol = box.length-1-row;
            for(int col=0;col<box[row].length;col++){
                res[col][rCol] = arr[col];
            }
        }
        for(int col=0;col<res[0].length;col++){
            int lastRow = res.length-1;
            int lastFree = -1;
            while(lastRow>=0){
                char ch = res[lastRow][col];
                if(ch=='.'&&lastFree==-1){
                    lastFree = lastRow;
                }else if(ch=='*'){
                    lastFree = -1;
                }else if(ch=='#'){
                    if(lastFree!=-1){
                        res[lastFree][col]=ch;
                        res[lastRow][col]='.';
                        lastFree--;
                    }
                }
                lastRow--;
            }
        }
        return res;
    }
}