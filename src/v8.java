public class v8 {
    public static boolean isNumberInRow(int[][] board, int number, int row) {
        for (int i=0;i<9;i++){
            if (board[row][i]==number){
                return true;
                
            }
            
        }
        return false;
        

    }
    

    public static boolean isNumberInCoulmn(int[][] board, int number, int column) {
        for (int i=0;i<9;i++){
            if (board[i][column]==number){
                return true;
                
            }
    
        }
        return false;
        

    }

    
    public static boolean isNumberInBox(int[][] board, int number, int row, int column){
        int boxStartRow = (row/3)*3;
        int boxStartCol = (column/3)*3;

        int boxEndRow = boxStartRow + 2;
        int boxEndCol = boxStartCol + 2;
        for (int j = boxStartRow; j <= boxEndRow;j++){
            for (int i = boxStartCol; i<= boxEndCol;i++){
                if (board[j][i]==number){
                    return true;
                }
            }

        }
        return false;



    }


    public static boolean isNumberPlaceable(int[][] board, int number, int row , int column){
        boolean foundr = isNumberInRow(board, number, (row));
  
        boolean foundc = isNumberInCoulmn(board, number, (column));
    
        boolean foundb = isNumberInBox(board,number , (row), (column));
        
        if (!(foundb || foundr || foundc)){
            return true;
        }
        return false;

    
    }
    
    public static void printboard(int[][] board){
        
        System.out.println("Sudoku board loaded into memory.");
        System.out.println("-------------------------");
        for (int i= 0; i<9; i++ ){
            
            for (int j=0; j<9; j++){
                if(j==0){
                System.out.print("| ");
                }
                System.out.print(board[i][j]+" ");
                if ((j == 2)||(j==5)||(j==8) ){
                    System.out.print("| ");
                }
            }
            if ((i== 2)||(i==5)||(i==8) ){
                    System.out.println();
                    System.out.println("-------------------------");
            }
            else{
                 System.out.println();
            }
                
    }
    

    }


    public static boolean solveBoard(int[][] board){
        for (int i=0; i<9; i++){
            for (int j=0; j<9; j++){
                if(board[i][j]==0){
                    for(int k=1; k<10;k++){
                        boolean placeable = isNumberPlaceable(board, k, i, j);
                        if (placeable){
                            board[i][j]=k;
                            boolean rec = solveBoard(board);
                            if (rec){
                                return true;
                            }
                            board[i][j]=0;
                        }

                    }
                    return false;

                }
            }
        }
        return true;

    }

    public static void main(String[] args) {
      
        int[][] board = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

    printboard(board);    

    boolean solved = solveBoard(board);
    if (solved){
        printboard(board);
    }

}
}

