package seance2;

public class Personne {
	
	private String nom;
	private Adresse adr;
	
	public Personne (String nom , Adresse adr){
		this.nom = nom; 
		this.adr = adr;
	}
	
	public String toString(){
		return nom + ": " + adr.toString();
	}

}
