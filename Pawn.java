//Pawn moves and methods :: 

package Pieces;
import Game.Board;
import Game.Color;
import Game.Game;
import Game.Player;
import Game.Form;




public class Pawn extends Piece
{
  Form form;  
  public Pawn(int x, int y, Player player)
  {
    super(x, y, player);
    form = Form.PAWN;
  }  
  public Form getForm()
  {
    return Form.PAWN;
  }  
  public boolean isValidPath(int lastX, int lastY)
  {
    if (pawnCanMoveTwo(lastX, lastY)) {
      return true;
    }    
    if (pawnCanCapture(lastX, lastY)) {
      return true;
    }    
    if (pawnCanMoveForward(lastX, lastY)) {
      return true;
    }
    return false;
  }
  
  protected boolean pawnCanCapture(int lastX, int lastY)
  {
    int abs_X_diff = Math.abs(lastX - x);
    int abs_Y_diff = Math.abs(lastY - y);
    int Y_difference = lastY - y;
    Piece[][] board = player.myGame.gameBoard.boardArray;
    
    if ((abs_X_difference == abs_Y_diff) && (abs_Y_difference == 1))
    {
      if ((player.playerColor == Color.WHITE) && (board[lastX][lastY] != null) && (player.playerColor == Color.BLACK) && (Y_difference < 0))
      {
        return true;
      }
      if ((player.playerColor == Color.BLACK) && (board[lastX][lastY] != null) && (player.playerColor == Color.WHITE) && (Y_difference > 0))
      {
        return true;
      }
    }
    return false;
  }
  
  
  
  
  
   public int[][] drawPath(int firstX, int firstY, int lastX, int lastY)
  {
    int pairs = 0;
    int[][] path = new int[2][pairs];
    
    return path;
  }
}