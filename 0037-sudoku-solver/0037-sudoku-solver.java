class Solution {
    public void solveSudoku(char[][] board) {
        sudoku(board,0,0);

    }
    public boolean sudoku(char[][] board,int row,int col){
        if(row==board.length){
       print(board);
       System.out.println("end");
            return true;
        }
        
        if(col==board[0].length){
            boolean flag= sudoku(board,row+1,0);
             if(flag)return true;
             return false;
        }

        if(col==-1){
             boolean flag= sudoku(board,row-1,board[0].length-1);
            if(flag)return true;
            return false;
        }
        
      for(int i=1;i<=9;i++){
        
   if(board[row][col]!='.'){
    boolean flag=sudoku(board,row,col+1);
   if(flag)return true;
   return false;
   }
        if(issafe(board,row,col,i)){
            board[row][col]=(char)(i+'0');
        //System.out.println((char)(i+'0'));
           boolean flag= sudoku(board,row,col+1);
           if(flag){
            return true;
           }
             board[row][col]='.';
             
        }
      }
      return false;
        
    }

public void print(char[][] board){

    for(int i=0;i<board.length;i++){
         System.out.print("[[[");
        for(int j=0;j<board[i].length;j++){
       System.out.print(board[i][j]+",");
    }
     System.out.print("],");
    }
}


public boolean issafe(char[][] board,int row,int col,int tar){
    for(int i=0;i<board[0].length;i++){
        if(board[row][i]==(char)('0'+tar)){
            return false;
        }
    }

      for(int i=0;i<board.length;i++){
        if(board[i][col]==(char)('0'+tar)){
            return false;
        }
    }

    int colStart=(col/3)*3;
    int rowStart=(row/3)*3;

    for(int i=rowStart;i<rowStart+3;i++){
        for(int j=colStart;j<colStart+3;j++){
        if(board[i][j]==(char)('0'+tar)){
            return false;
        }
    }
    }
    return true;
}

    
}