import org.junit.*;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class TicTacToeTest{
/*
1) target cell exists and is empty - success !!
2) target cell exists but isn't empty - failure !
3) target cell doesn't exist - failure !
4) invalid player - failure
 */
@Test
public void targetCellExistsAndIsEmptyShouldWork(){
  //target cell exists and is empty - success !!
  TicTacToe game = new TicTacToe();
  game.initiateGameBoard();

  assertTrue(game.makeMove(1,2,2));

  assertEquals(1,game.myarray[2][2] );


  }

@Test
public void targetCellExistsButIsNotEmptyShouldFail() {
  // target cell exists but isn't empty
  TicTacToe game = new TicTacToe();
  game.initiateGameBoard();
  assertTrue(game.makeMove(1,2,2));

  assertFalse(game.makeMove(1,2,2));


  }


@Test
public void targetDoesNotExistShouldFail() {
  // target cell does not exists
  TicTacToe game = new TicTacToe();
  game.initiateGameBoard();

  assertTrue(game.makeMove(1,2,2));

  assertFalse(game.makeMove(1,3,3));


  }


  @Test
  public void invalidPlayerShouldFail() {
    // target cell exists but player input not valid
    TicTacToe game = new TicTacToe();
    game.initiateGameBoard();

    assertFalse(game.makeMove(3,2,2));
    assertFalse(game.makeMove(3,3,3));
    assertFalse(game.makeMove(-1,2,2));



  }

}
