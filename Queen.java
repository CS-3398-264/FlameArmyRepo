//Queen moves and methods

package Pieces;

import Game.Player;
import Game.Form;
public class Queen
  extends Piece
{
  Form form;
  
  public Queen(int x, int y, Player player)
  {
    super(x, y, player);
    form = Form.QUEEN;
  }
  
  public Form getForm()
  {
    return Form.QUEEN;
  }
  
  public boolean isValidPath(int lastX, int lastY)
  {
    int x_difference = Math.abs(lastX - x);
    int y_difference = Math.abs(lastY - y);
    
    if ((x_difference == y_difference) || (lastX == x) || (lastY == y)) {
      return true;
    }
    return false;
  }

  public int[][] drawPath(int startX, int startY, int lastX, int lastY)
  {
    int x_dir = 0;int y_dir = 0;
    int pairs;
    if (lastY == firstY)
    {
      int pairs = Math.abs(lastX - firstX);
      if (finalX - startX < 0) {
        x_dir = -1;
      } else {
        x_dir = 1;
      }
    }
    else if (lastX == firstX)
    {
      int pairs = Math.abs(lastY - firstY);
      if (lastY - firstY < 0) {
        y_dir = -1;
      } else {
        y_dir = 1;
      }
    }
    else
    {
      pairs = Math.abs(lastX - firstX);
      if (lastX - firstX < 0) {
        x_dir = -1;
      } else
        x_dir = 1;
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

