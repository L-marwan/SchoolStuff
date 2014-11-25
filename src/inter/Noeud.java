package inter;

public class Noeud <T> implements Cloneable {
	
	T cle;
	Noeud<T> fg,fd;
	
	public Noeud (){	
	}
	public Noeud ( T cle){
		this.cle = cle;
	}
	
	public Noeud (T cle, Noeud<T> fg ,Noeud<T> fd){
		this.cle = cle;
		this.fg = fg;
		this.fd = fd;
	}
	
	public Noeud<T> clone () throws CloneNotSupportedException{
		
		Noeud<T> c = (Noeud<T>) super.clone();
		
		c.fg = fg.clone();
		c.fd = fd.clone();
		return c ;
	}
	public String toString (){
		return cle.toString();
	}
	
	
	

}
