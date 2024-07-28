import java.util.Random;

public class Board {
    int row;
    int coloumn;
    boolean[][] board;
    public Board(int row, int coloumn){
        this.row=row;
        this.coloumn=coloumn;
        Random random=new Random();
        this.board=new boolean[row+2][coloumn+2];
        int numOfBombs=row*coloumn/4;
        int i=0;
        while(i<numOfBombs){
            int a=random.nextInt(row)+1;
            int b=random.nextInt(coloumn)+1;
            if(board [a][b]){
                continue;
            }
            else{
                board[a][b]=true;
                i++;
            }
        }
    }

    int numberOfNeigbours(int r, int c){
        int count=0;
        if(board[r][c]){
            return -1;
        }
        else{
        for(int i=-1; i<=1; i++){
            for (int j=-1; j<=1; j++){
                if(board[r+i][c+j]){
                    count++;
                }
                
            }
        }
        return count;
    }
    }
}
