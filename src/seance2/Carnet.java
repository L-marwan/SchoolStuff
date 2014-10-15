package seance2;

public class Carnet {
	
	private Personne [] carn;
	private int dim; // dimension du tableau carn
	private int der = -1 ; // la derniere position occupee dans carn
	
	public Carnet( int dim){
		carn = new Personne[dim] ;
		this.dim = dim;
	}
	
	public void ajouter ( Personne p){
		der++;
		carn [der] = p;
	}
	
	public String  toString (){
		String c = "";
		
		for ( Personne p : carn) c += p.toString() + "\n";
		return c;
		
	}

}
