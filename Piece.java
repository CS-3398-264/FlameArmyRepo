//Pieces moves and methods

package Pieces;
import Game.Player;
import Game.Type;
public abstract class Piece
{
  public int x;
  public int y;
  public Player player;
  
  public Piece(int x, int y, Player player)
  {
    this.x = x;
    this.y = y;
    this.player = player;
    playermyGame.gameBoard.boardArray[x][y] = this;
  }
  
  public abstract boolean isValidPath(int paramInt1, int paramInt2);
  
  public abstract int[][] drawPath(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  public abstract Type getType();
}

