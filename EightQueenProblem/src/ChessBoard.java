
public class ChessBoard {
	int size;
	int [][]cb; //ChessBoard
	Queen []queens; //Queens 
	boolean check;
	
	public ChessBoard(int n) {
		this.size = n;
		cb = new int[n][n];
		for(int x=0;x<n;x++)
			for(int y=0;y<n;y++){
				cb[x][y] =0;
			}
		queens = new Queen[n];
	}
	
	public boolean addQueen(int x, int y) {
		
		for(int i =0;i<size;i++) {
			if ((queens[i] == null) && (cb[x][y] == 0)) {
				queens[i]= new Queen(x,y);
				return true;
			}
		}
		return false;
	}
	
	public String toString() {
		String Board = "";
		for(int x=0;x<size;x++) {
			for(int y=0;y<size;y++){
				Board = Board + "  " + cb[x][y] + " ";
			}
			Board += "\n\n";
			
		}
		
		return Board;
		
	}

	
	public class Queen{
		int X,Y;
		public Queen(int x, int y) {
			this.X =x;
			this.Y =y;
			cb[x][y] =1;
		}
		public int getX() {
			return X;
		}
		public int getY() {
			return Y;
		}
		
	
	}


	public Queen[] getQueens() {
		for(int i =0;i<size;i++) {
				if (queens[i] != null)
				System.out.println("q"+i+" "+queens[i].getX()+" "+queens[i].getY());
			}
		return queens;
	}
	
	
	
}
