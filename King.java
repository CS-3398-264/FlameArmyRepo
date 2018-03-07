
//King moves and methods:: 

package Pieces;
import Game.Board;
import Game.Player;
import Game.Form;
import java.util.Vector;

public class King extends Piece
{
  Form form;
  public boolean kingInCheck = false;

  public King(int x, int y, Player player)
  {
    super(x, y, player);
    form = Form.KING;
  }
  public Form getForm()
  {
    return Form.KING;
  }
  public boolean isValidPath(int lastX, int lastY)
  {
    if (isValidPathFinder(lastX, lastY))
    {
      return true;
    }
     return false;
  }  
  public boolean isValidPathFinder(int lastX, int lastY)
  {
    int x_difference = Math.abs(lastX - x);
    int y_difference = Math.abs(lastY - y);    
    if ((x_difference < 2) && (y_difference < 2)) {
      return true;
    }    
    return false;
  }
protected boolean kingCanMove(int lastX, int lastY)
  {
    Board board = player.myGame.gameBoard;    
    if ((board.isValidMove(this, lastX, lastY)) && (isValidPathFinder(lastX, lastY)) && (!isInCheckPosition(lastX, lastY)))
    {
      return true;
    }
    return false;
  }
  public boolean isInCheckPosition(int x, int y)
  {
    Vector<Piece> opponents = player.getOpponentPieces(player.playerColor);
    
    for (int i = 0; i < opponents.size(); i++)
    {
      if (canKillKing((Piece)opponents.elementAt(i), x, y))
      {
        return true;
      }
    }    
    return false;
  }
  protected boolean canKillKing(Piece opponents, int x, int y)
  {
    Board board = player.myGame.gameBoard;
    if ((opponents.getType() == Form.PAWN) && (board.isValidMove(opponents, x, y)) && (opponents.isValidPath(x, y)))
    {
      return true;
    }
    Player player = this.player;
    int kingX = this.x;
    int kingY = this.y;
    boardArray[kingX][kingY] = null;
    
    if ((board.isValidMove(opponents, x, y)) && (opponents.isValidPath(x, y)))
    {

      King new_king = new King(kingX, kingY, player);
      return true;
    } 
    King new_king = new King(kingX, kingY, player);
    return false;
  }
  public int[][] drawPath(int firstX, int firstY, int lastX, int lastY)
  {
    int pairs = 0;
    int[][] path = new int[2][pairs];    
    return path;
  }
}