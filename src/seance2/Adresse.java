package seance2;

public class Adresse {
	
	private String rue, ville;
	
	public Adresse ( String rue , String ville ){
		this.rue = rue;
		this.ville = ville;
	}
	
	public String toString (){
		return rue + "," + ville ;
	}

}
