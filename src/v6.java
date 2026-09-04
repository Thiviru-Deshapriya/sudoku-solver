public class v6 {
    public static boolean IsNumberInRow(int[][] board, int number, int row) {
        for (int i=0;i<9;i++){
            if (board[row][i]==number){
                return true;
                
            }
            
        }
        return false;
        

    }
    

    public static boolean IsNumberInCoulmn(int[][] board, int number, int column) {
        for (int i=0;i<9;i++){
            if (board[i][column]==number){
                return true;
                
            }
    
        }
        return false;
        

    }
    public static void main(String[] args) {
        
        // Defining the 9x9 Sudoku grid
        // 0 represents an empty cell
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
    // Testing row 0 for the number 7 (which we know is there)
    boolean foundr = IsNumberInRow(board, 7, 0);
    System.out.println("Is 7 in row 0? " + foundr);

    // Testing column 0 for the number 6
    boolean foundc = IsNumberInCoulmn(board, 6, 0);
    System.out.println("Is 6 in column 0? " + foundc);
}
}

//next 3x3 box checking