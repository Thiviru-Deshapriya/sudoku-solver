public class v5 {
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
}
}

//next6 number check on selected row and column