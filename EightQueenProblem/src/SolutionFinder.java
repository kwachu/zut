
public class SolutionFinder {
	AttackCheck[][] q1;
	int n;
	int qCount;
	public SolutionFinder(int n) {
		q1 = new AttackCheck[n+1][n*n];//n+1 bo ilość
		//q1 = new AttackCheck[n*n];
		this.n = n;
		qCount=1;//liczę od 1 (bo ilość)
		
		for (int i =0;i<n*n;i++) {
			//System.out.println(" "+qCou + i);
			q1[qCount][i] = new AttackCheck(new ChessBoard(4));
			//System.out.println(""+q1[qCount][i].Ab);
		}
		q1(n);
	}
	
	void q1(int jot) {
		
		while (jot > 0) {
		//add Queen on (X,Y)
			
		for (int i=0;i<n*n;i++) 
		for(int x=0;x<n;x++) {
			for(int y=0;y<n;y++) {

					if (q1[qCount+1][i] != null && q1[qCount][i].Ab.check && q1[qCount][i].Ab.addQueen(x, y)) {
						System.out.println("Q"+qCount+"["+i+"] added!");
						System.out.println(q1[qCount][i].Ab);
					}
					else
						System.out.println("Q"+qCount+"["+i+"] FAIL!");
					i++;
					System.out.println(""+x +" " + y);
			}
		}
		
		//if isAttacked - I'm not interest in!
		for (int i =0;i<n*n;i++) {
			if (q1[qCount][i].isAttacked()) {
				q1[qCount][i].Ab.check = true;
			}
			else if (qCount + 1 <= n && q1[qCount+1][i] != null ) {
				q1[qCount][i].Ab.check = false;
				q1[qCount+1][i] = q1[qCount][i];
			}
			
				
		}
		
		qCount++;
		jot--;
		}
	}
	
}
