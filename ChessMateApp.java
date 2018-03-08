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
		JButton menuPrompt = new JButton("Chess Rules");
		String rules = "Chessboard layout\n"
				+ "Each player has a white color square in bottong right hand side"
				+ ". the chess piece are then arranged the same way each time.\n"
				+ "The second row is filled with pawns. The rooks go in the corners,"
				+ " then the knights next to them followed by the bishops, and finally\n"
				+ " the queen, then the king\n\n"
				+ "\nCheckmate in Chess\n"
				+ "The purpose of the game is to checkmate the opponent's king. this "
				+ "happens when the king is put into check and cannot get out of check\n"
				+ "There are only three ways a king can get out of check: move out of"
				+ "the way, block the check with another piece, or capture the piece\n"
				+ "threatening the king. If the king cannot escape checkmate then the"
				+ "game is over.\n\n"
				+ "Play AI - allows you to play a game against a randomize chess player"
				+ "who moves any random piece according to their move set\n\n"
				+ "Play Player - allows you to play against an opponent on the same system"
				+ ", each taking turns moving thier chess pieces.";
		
		String movement = "How the Chess pieces move\n"
				+ "\n"
				+ "Each of the 6 different kinds of pieces move differently. Pieces cannot"
				+ "move through other pieces (though the kinght can jump over other pieces),\n"
				+ "and can never move into a square with one of their own pieces. However, they"
				+ "can be moves to take the place of an opponent's piece which is\n then caputures\n"
				+ "\n\n"
				+ "King - Can only move one square in any direction - up, down, to the sides, and"
				+ "diagonally. King cannot move himself into check.\n\n"
				+ "Queen - Can move in any one straight direction - forward, back, sideways, or"
				+ "diagonally as far as possible\n\n"
				+ "Rook - Rook may move as far as it wants, but only forward, backward and to the sides.\n\n"
				+ "Biship - May move as far as it wants, but only diagonally.\n\n"
				+ "Knight - May move going two squares in one direction, and then one more move at a "
				+ "90 degree ange, just like an 'L' shape.\n\n"
				+ "Pawn - Move forward, but capture diagonally. Pawns can only move forward one square"
				+ "at a time, except for their\nvery first move where they can move"
				+ "two squares. Cannot capture backwards.";
		
		
		
		menuPrompt.setBounds(450, 0, 150, 30);
		playAI.setBounds(50, 300, 95, 30);
		buttonPlayer.setBounds(50, 150, 95, 30);
		
		menuPrompt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDialog dialog = new JDialog();
				dialog.setSize(800, 800);
				JTextArea ta = new JTextArea();
				JTextArea taRules = new JTextArea();
				
				ta.setSize(500, 500);
				ta.setText(movement);
				taRules.setSize(500, 500);
				taRules.setText(rules);
				JPanel p1 = new JPanel();
				p1.add(ta);
				JPanel p2 = new JPanel();
				p2.add(taRules);
				JTabbedPane tp = new JTabbedPane();
				tp.setBounds(50,50,300,300);
				tp.add("Rules", p2);
				tp.add("Piece Movements", p1);
				dialog.add(tp);
				dialog.setVisible(true);
				
			}
		});
		
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
		
		mainFrame.add(menuPrompt);
		mainFrame.add(buttonPlayer);
		mainFrame.add(playAI);
		mainFrame.add(chessBoard);
		
		mainFrame.add(tf);
		mainFrame.setSize(1000, 1000);
		mainFrame.setLayout(null);
		mainFrame.setVisible(true);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	}
}
