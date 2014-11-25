package tp4;

public class monome {
	
	private int degre;
	private double coeff;
	
	public monome (){
		degre = 0;
		coeff = 0 ;
	}
	
	public monome ( int d , double c){
		degre = d;
		coeff = c;
	}
	
	public String toString (Object m ){
		
		monome c = (monome)m;
		return c.coeff+"X^"+c.degre;
		
	}
	
/*	public monome somme(monome m){
		
		if (m.degre == degre) return new monome ( degre, coeff + m.coeff);
		return 
	}*/
	
	
}
