package inter;

import java.io.File;
import java.util.LinkedList;


public class Testing {
	public static void main (String[] args) throws Exception{
		LesEtudiants l = new LesEtudiants();
		File f = new File ("test.txt");
		l.lire(f);
		System.out.print(l.toString());
		LinkedList <LinkedList<Etudiant>> t =l.groupes();
		for (LinkedList<Etudiant> li: t){
			System.out.println("-----");
			for (Etudiant e : li) System.out.println(e + " "+ e.moyenne());
		}
		
		
	}
}
