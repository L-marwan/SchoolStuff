package inter;

import java.io.File;
import java.util.LinkedList;
import java.util.Scanner;

public class LesEtudiants extends Abr <Etudiant>{
	
	public void lire (File f ) throws Exception{
		Scanner s = new Scanner (f);
		
		while (s.hasNext()) {
			String n = s.next();
			long c = s.nextLong();
			double n1 = Double.parseDouble(s.next());
			double n2 = Double.parseDouble(s.next());
			double n3 = Double.parseDouble(s.next());
			double n4 = Double.parseDouble(s.next());
			inserer ( new Etudiant (n,c,n1,n2,n3,n4));
		}
                s.close();
	}
	
	public LinkedList<LinkedList<Etudiant>> groupes (){
		//LinkedList [] l = new LinkedList [4]; //cannot create generic array.. ???
		LinkedList<LinkedList<Etudiant>> l = new LinkedList<LinkedList<Etudiant>>();
		l.add(new LinkedList<Etudiant>());
		l.add(new LinkedList<Etudiant>());
		l.add(new LinkedList<Etudiant>());
		l.add(new LinkedList<Etudiant>());
		
		
		for (Noeud<Etudiant> e : this){
			if (0<=e.cle.moyenne()&& e.cle.moyenne()<5) l.get(0).add(e.cle);
			if (5<=e.cle.moyenne()&& e.cle.moyenne()<10) l.get(1).add(e.cle);
			if (10<=e.cle.moyenne()&& e.cle.moyenne()<15) l.get(2).add(e.cle);
			if (15<=e.cle.moyenne()&& e.cle.moyenne()<20) l.get(3).add(e.cle);
			
		}
		return l;
	}

}
