package chessPack;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
public class ChessMateApp 
{
	public static void main(String[] args)
	{
		
		JFrame mainFrame = new JFrame("Chess Mate Game");
		final JTextField tf = new JTextField();
		tf.setBounds(50, 50, 300, 50);
		JButton playAI = new JButton("Play AI");
		JButton buttonPlayer = new JButton("1 VS 1");
		
		playAI.setBounds(50, 300, 95, 30);
		buttonPlayer.setBounds(50, 150, 95, 30);
		
		playAI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText("Work in prograss, does noting");
				
			}
		});
		
		Dimension size = new Dimension(1000, 1000);
		JPanel chessBoard = new JPanel();
		chessBoard.setLayout( new GridLayout(8,8));
		chessBoard.setPreferredSize(size);
		chessBoard.setBounds(0, 0, size.width, size.height);
		for (int i = 0; i < 64; i++) 
		{
				JPanel square = new JPanel( new BorderLayout());
				 chessBoard.add(square);
				 
				 int row = (i / 8) % 2;
				  if (row == 0)
				  square.setBackground(i % 2 == 0 ? Color.black : Color.white );
				  else
				  square.setBackground( i % 2 == 0 ? Color.white : Color.black);
		}
		
		mainFrame.add(buttonPlayer);
		mainFrame.add(playAI);
		mainFrame.add(chessBoard);
		
		mainFrame.add(tf);
		mainFrame.setSize(1000, 1000);
		mainFrame.setLayout(null);
		mainFrame.setVisible(true);
	}
}
