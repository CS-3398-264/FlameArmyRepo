package chessPack;
import java.*;

import java.awt.*;
import java.io.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Chessboard extends JPanel
{
	private JPanel chessBoard;
	Dimension size = new Dimension(600, 600);
	private ArrayList<Pawn> myPawns = new ArrayList();
	
	public Chessboard()
	{
		chessBoard = new JPanel();
		chessBoard.setLayout( new GridLayout(8,8));
		chessBoard.setPreferredSize(size);
		chessBoard.setBounds(0, 0, size.width, size.height);
		for (int i = 0; i < 64; i++) {
			  JPanel square = new JPanel( new BorderLayout());
			  chessBoard.add(square);
			 
			  int row = (i / 8) % 2;
			  if (row == 0)
			  square.setBackground(i % 2 == 0 ? Color.black : Color.white );
			  else
			  square.setBackground( i % 2 == 0 ? Color.white : Color.black);
			  }
	}
	
	public int arraySize()
	{
		return myPawns.size();
	}
	
}

