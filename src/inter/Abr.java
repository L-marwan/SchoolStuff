package inter;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Abr <T extends Comparable<T>> implements Iterable<Noeud <T>>,Cloneable{
	
	protected Noeud<T> racine;
	protected Comparator<T> comp;
	
	// constructors ------------
	public Abr(){
		racine = null;
		comp = null;
	}
	
	public Abr ( Comparator<T> comp ){
		racine = null;
		this.comp = comp;
	}
	
	
	public int compare ( T o1 , T o2){
		if (comp == null) return o1.compareTo(o2);
		else 
			return comp.compare(o1, o2);
	}
	// inserer :-----------------
	private Noeud<T> inserer (Noeud<T> n , T o){
		if (n == null ) return new Noeud <T> (o);
		if (compare(o , n.cle) < 0)
			n.fg = inserer ( n.fg , o);
		else 
			n.fd = inserer ( n.fd , o );
		return n;
	}
	public void inserer ( T o){
		racine = inserer (racine, o);
	}
	// parcour GRD :---------------
	public void infixe (Noeud<T> n , List<Noeud <T>> l){
		
		if ( n == null ) return;
		infixe ( n.fg ,l );
		l.add( n);
		infixe (n.fd ,l );
	}
	public List<Noeud <T>> infixe (){
		LinkedList<Noeud <T>> l = new LinkedList<Noeud <T>>();
		infixe ( racine , l );
		return l;
	}
	// Iterator :----------------
	@Override
	public Iterator<Noeud <T>> iterator() {

		return infixe().iterator();
	}
	
	
	//toString : ---------------------
	public String toString (){
		String s ="";
		for ( Noeud<T> n : this ) s+= n.toString() + "\n";
		return s;
	}
	// Clone :----------------------
	public Abr<T> clone() throws CloneNotSupportedException{
		Abr <T> a = new Abr<T>();
		if (comp == null)
			a.comp = null;
		else 
			a.comp = comp;
		a.racine = racine.clone();
		return a;
	}

}
