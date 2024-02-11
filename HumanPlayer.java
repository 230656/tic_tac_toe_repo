import java.util.Scanner;

public class HumanPlayer{
    String name;
    char mark;

    HumanPlayer(String name, char mark){
        this.name = name;
        this.mark = mark;
    }

    void makeMove(){
        Scanner scan = new Scanner(System.in);
        int row;
        int col;
        do {
            System.out.println("Enter the row and col");
            row = scan.nextInt();
            col = scan.nextInt();
        } while (!isValidMove(row, col));

        TicTacToe.placeMark(row, col, mark);
    }

    boolean isValidMove(int row, int col){
        if (row >= 0 && row <=2 && 
            col >=0 && col <=2) {
            if (TicTacToe.board[row][col] == ' ') {
                return true;
            }    
        }
        return false;
    }

}