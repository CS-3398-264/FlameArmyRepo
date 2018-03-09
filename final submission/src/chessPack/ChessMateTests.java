package chessPack;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;


/**
 * This class contains tests functions for the "ChessMateApp"
 * @author FlameArmy
 *
 */
public class ChessMateTests 
{
	
	@Test
	public void testTimer()
	{
		ChessTimer gameTimer = new ChessTimer();
		gameTimer.startTime();
		assertTrue(gameTimer.returnInMin() != 10);
	}
	
	@Test
	public void checkIfKingIsNotInCheck()
	{
		King myKing = new King(false, "King");
		assertEquals(myKing.rtnCheckmate(), false);
	}
	
	@Test
	public void testIfPawnIsPromoted()
	{
		Pawn testPawn = new Pawn(false, "pawnImage");
		assertTrue(testPawn.rtnPromotion() == false);
	}
	
	@Test
	public void testPawnMoveType()
	{
		Pawn testPawn = new Pawn (false, "pawnImage");
		assertEquals(testPawn.rtnPawnMove(), "Pawn");
	}
	
	@Test
	public void testBishopMoveType()
	{
		Bishop myBishop = new Bishop(false, "Bishop");
		myBishop.rtnMoveType();
		assertEquals(myBishop.rtnMoveType(), "Bishop");
		
	}
	
	@Test
	public void testQueenMoveType()
	{
		Queen myQueen = new Queen(false, "Queen");
		assertFalse(myQueen.rtnMoveType() != "King");
	}
	
	@Test
	public void testRookMoveType()
	{
		Rook myRook = new Rook(false, "Rook");
		assertFalse(myRook.rtnMoveType() == "Rook");
	}
	
	@Test
	public void testKnightMoveType()
	{
		Knight myKnight = new Knight(false, "Knight");
		assertFalse(myKnight.rtnKnightMoveType() == "Rook");
	}
	
	@Test
	public void testSizeOfArrayOfPawns()
	{
		Chessboard myChessBoard = new Chessboard();
		assertFalse(myChessBoard.arraySize() == 8);
	}
	
}
