//Rook moves and methods

package Pieces;

import Game.Player;
import Game.Form;
public class Rook
  extends Piece
{
  Form form;
  
  public Rook(int x, int y, Player player)
  {
    super(x, y, player);
    form = Form.ROOK;
  }
  public Form getForm()
  {
    return Form.ROOK;
  }
  public boolean isValidPath(int lastX, int lastY)
  {
    if ((lastX == x) || (lastY == y)) {
      return true;
    }
    return false;
  }
    public int[][] drawPath(int firstX, int firstY, int lastX, int lastY)
  {
    int x_dir = 0;int y_dir = 0;
    int pairs; if ((lastX - firstX != 0) && (firstY == lastY))
    {
      int pairs = Math.abs(lastX - firstX);
      if (lastX - firstX < 0) {
        x_dir = -1;
      } else {
        x_dir = 1;
      }
    }
    else
    {
      pairs = Math.abs(lastY - firstY);
      if (lastY - firstY < 0) {
        y_dir = -1;
      } else {
        y_dir = 1;
      }
    }
    int[][] path = new int[2][pairs];
    if (pairs - 1 > 0)
    {
      for (int i = 0; i < pairs - 1; i++)
      {
        path[0][i] = (firstX + x_dir * 1);
        path[1][i] = (firstY + y_dir * 1);
      }
    }
    
    return path;
  }
}