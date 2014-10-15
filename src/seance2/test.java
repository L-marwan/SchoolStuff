package seance2;


public class test {
	
	
	
	public static void main ( String[] args){
		
		Adresse a = new  Adresse ("Hay Salam" , "Sale");
		Personne p = new Personne ("Marouan" , a);
		Adresse a2 = new  Adresse ("Hay Salam" , "Sale");
		Personne p2 = new Personne ("Marouan2" , a2);
		Adresse a3 = new  Adresse ("Hay Salam" , "Sale");
		Personne p3 = new Personne ("Marouan3" , a3);
		
		Carnet carn = new Carnet (3);
		carn.ajouter(p);
		carn.ajouter(p2);
		carn.ajouter(p3);
		
		System.out.println(carn);
		
		

	}

}
