public class Display {
        int row;
        int coloumn;
        int[][] board; //-1 for unopen, -2 for bomb marks, n for open

        public Display(int row, int coloumn){
            this.row=row;
            this.coloumn=coloumn;
            this.board=new int[row][coloumn];
            for(int i=0; i<row; i++){
                for (int j=0; j<coloumn; j++){
                    board[i][j]=-1;
                }
            }
        }


        void mark(int r, int c){
            board[r-1][c-1]=-2;
        }

        void open(int r, int c, int value){
            board[r-1][c-1]=value;
        }

        void display(){
            for (int i=0; i<=coloumn; i++){
                System.out.print(i+" ");
            }
            System.out.println();
            System.out.print("  ");
            for (int i=1; i<=coloumn; i++){
                System.out.print("_ ");
            }
            System.out.println();
            for(int i=0; i<row; i++){
                System.out.print(i+1+"|");
                for (int j=0; j<coloumn; j++){
                    if(board[i][j]==-1){
                        System.out.print("-");
                    }
                    else if(board[i][j]==-2){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(board[i][j]);
                    }
                    System.out.print(" ");
                }
                System.out.println();
            }
        }

}
