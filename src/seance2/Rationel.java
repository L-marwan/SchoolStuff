package seance2;

public class Rationel {
	//La classe Rationel represente  un nombre sous la forme : num/denum
	
	
	// les atribus---------
	
	int num;
	int denum;
	
	//-----------------
	// les costructeur: le premier construit un rationel a partir de 2 args, et le deuxiem a partir d'un seul
	private Rationel (int num, int denum) {
		if (denum == 0) System.out.println ("rationel invalide!");
		this.num = num ; 
		this.denum = denum ;
	}
	private Rationel (int num){
		this(num,1);
	}
	public static Rationel creer( int num , int denum){ // une methode qui permet  de controller les constructeurs
		if ( denum == 0) return null;
		else return new Rationel (num , denum);
	}
	public Rationel(){ // constructeur par default, donne le rationel 0
		this(0);
	}
	
	//---------------------------
	
	private static int pgcd (int a, int b ){ // cette methode permet de trouver le pcgd, afin de l'utiliser pour normaliser un rationel
		if ( b == 0) return a;
		if ( a < b ) return pgcd (b - a , a);
		return pgcd (a - b, b);
	}
	
	public Rationel normal(){ // normal retourne un rationel qui est la forme canonique du rationel
		int d=pgcd (num , denum);
		return new Rationel( num / d , denum / d);
	}
	
	
	public String toString() { // pour afficher les rationel sous la forme " num/denum" 
		return num + "/" + denum ;
	}
	
	public boolean equals (Rationel r){ // methode qui teste si deux rationel ont la meme representaion canonique
		return ( this.normal().num == r.normal().num ) && ( this.normal().denum == r.normal().denum );
	}
	
	public Rationel somme (Rationel r){ // methode d'instance qui calcule la somme de deux rationel
		return new Rationel( ( num * r.denum ) + ( denum * r.num ) , denum * r.denum ).normal();
	}
	
	public static Rationel somme ( Rationel r1, Rationel r2){ // methode de classe qui calcule la somme de deux rationel
		return new Rationel( ( r1.num * r2.denum ) + ( r1.denum * r2.num ) , r1.denum * r2.denum ).normal();
		
	}

}
