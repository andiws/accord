public class TicTacToe {

  public int[][] myarray = new int[3][3];

  public void initiateGameBoard(){
      //to make all the cells empty or -1

    for(int i=0;i<3;i++)
      for(int j=0;j<3;j++)
        myarray[i][j] = -1;

  }

  public boolean makeMove(int player, int row, int col){
    /*
    1) target cell exists and is empty - success !!
	2) target cell exists but isn't empty - failure !
	3) target cell doesn't exist - failure !
	4) invalid player - failure
     */
    if (row>2 || col > 2){
      return false;
    }

    if (player > 1 || player < 0){
      return false;
    }


        if (myarray[row][col] == -1) {
          myarray[row][col] = player;
          return true;
        }
        else
          return false;

  }


}
