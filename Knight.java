//Knight moves and methods

package Pieces;

import Game.Player;
import Game.Form;
public class Knight extends Piece
{
  Form form;
  
  public Knight(int x, int y, Player player)
  {
    super(x, y, player);
    form = Form.KNIGHT;
  }
  
  public Form getForm()
  {
    return Form.KNIGHT;
  }
  
  public boolean isValidPath(int lastX, int lastY)
  {
    int x_difference = Math.abs(finalX - x);
    int y_difference = Math.abs(finalY - y);
    
    if (((x_difference == 1) && (y_difference == 2)) || ((x_difference == 2) && (y_difference == 1))) {
      return true;
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

