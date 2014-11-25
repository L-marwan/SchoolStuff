package inter;



public class Etudiant implements Comparable<Etudiant>{

    private String nom;
    private long code;
    final  int Nbnotes=4;
    double[] notes=new double[Nbnotes];
    
    public Etudiant(){}
    public Etudiant(String nom){
        this.nom=nom;
    }
    public Etudiant(String nom,long code){
        this.nom=nom;
        this.code=code;
    }
    public Etudiant (String nom , long code,double note1,double note2,double note3,double note4){
    	this(nom,code);
    	setNotes(note1, note2, note3, note4);
    }

    public void setNotes(double note1,double note2,double note3,double note4){
        notes[0]=note1;
        notes[1]=note2;
        notes[2]=note3;
        notes[3]=note4;
    }

    public double moyenne(){
        return (notes[0]+notes[1]+notes[2]+notes[3])/Nbnotes;
    }
    public static int compareCode(Etudiant e1,Etudiant e2){
        if(e1.code<e2.code)
            return -1;
        else if(e1.code>e2.code)
            return 1;
        return 0;
    }
    public String toString(){
    	return nom +"|" + code + "|" + notes[0] +" " +notes[1]+ " " +notes[2]+ " " +notes[3];
    }
    // compareTo ------------
	@Override
	public int compareTo(Etudiant o) {
		return compareCode (this,o);
	}

}
