
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ChessBoard chess = new ChessBoard(4);
		AttackCheck ac = new AttackCheck(chess);
		//chess.addQueen(3, 7);
		chess.addQueen(0,2);
		chess.addQueen(1, 0);
		
		System.out.println(chess);
		ac.beatsVerticalHorizontalCheck();
		ac.beatsDiagonalCheck();
	}

}
