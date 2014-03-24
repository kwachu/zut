
public class AttackCheck {
	ChessBoard Ab;
	public AttackCheck(ChessBoard Aboard) {
		Ab = Aboard;
	}
	
	boolean beatsVerticalHorizontalCheck() {
		int Xarray[] = new int[Ab.size];
		int Yarray[] = new int[Ab.size];
		for(int i=0;i<Ab.size;i++) {
			if(Ab.queens[i] != null) {
				Yarray[i] = Ab.queens[i].getX();
				Xarray[i] = Ab.queens[i].getY();
				//showAllQ System.out.println("Q" + i + " ( "+Xarray[i]+" ; "+Yarray[i]+" )");
			}
		}
		
		for(int i =0;i<Ab.size;i++) {
			for(int j=1;i+j<Ab.size;j++) {
				if (Xarray[i] == Xarray[i+j] && Xarray[i] != 0) {
					System.out.println("horizontaly Q"+ Xarray[i] + " " + Yarray[i] + " Q"+ Xarray[i+j] + " " + Yarray[i+j]);
					return true;
				}
				if (Yarray[i] == Yarray[i+j] && Yarray[i] != 0) {
					System.out.println("verticaly Q"+ Xarray[i] + " " + Yarray[i] + " Q"+ Xarray[i+j] + " " + Yarray[i+j]);
					return true;
				}
			}
		}
		
		return false;
	}
	
	
	boolean beatsDiagonalCheck() {
		int Xarray[] = new int[Ab.size];
		int Yarray[] = new int[Ab.size];
		for(int i=0;i<Ab.size;i++) {
			if(Ab.queens[i] != null) {
				Xarray[i] = Ab.queens[i].getX();
				Yarray[i] = Ab.queens[i].getY();
				//showAllQ System.out.println("Q" + i + " ( "+Xarray[i]+" ; "+Yarray[i]+" )");
			}
		}
		
		for(int i =0;i<Ab.size;i++) { //Xarray[i],Yarray[i] --> first Q to check
			for(int j=1;j<Ab.size;j++) { // Xarray[i+j],Yarray[i+j] --> next Q to check
				for(int k=0;k<Ab.size;k++) { 
				
				
				if ((i+j < Ab.size) && (Xarray[i] + Yarray[i]) == (Xarray[i+j] + Yarray[i+j]) && Xarray[i+j] != 0) {
					System.out.println("diagonalUP Q"+ Xarray[i] + " " + Yarray[i] + " Q"+ Xarray[i+j] + " " + Yarray[i+j]);
					return true;
				}
				if ((i+j < Ab.size) && ( Xarray[i] + k == Xarray[i+j] && Yarray[i] + k == Yarray[i+j] || Xarray[i] - k == Xarray[i+j] && Yarray[i] - k == Yarray[i+j]) && Yarray[i+j] != 0  && (Xarray[i] + k < Ab.size) && (Xarray[i] -k > 0)) {
					System.out.println("diagonalDOWN Q"+ Xarray[i] + " " + Yarray[i] + " Q"+ Xarray[i+j] + " " + Yarray[i+j] );
					return true;
				}
				
				}
			}
		}
		
		return false;
	}

}
