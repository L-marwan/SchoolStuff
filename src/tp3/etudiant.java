package tp3;

public class etudiant {
    private String nom;
    private long code;
    final  int Nbnotes=4;
    double[] notes=new double[Nbnotes];
    
    public etudiant(){}
    public etudiant(String nom){
        this.nom=nom;
    }
    public etudiant(String nom,long code){
        this.nom=nom;
        this.code=code;
    }
    public String getNom(){
        return nom;
    }
    public long getCode(){
        return code;
    }
    public void setNom(String nom){
        this.nom=nom;
    }
    public void setCode(long code){
        this.code=code;
    }
    public void setNotes(double note1,double note2,double note3,double note4){
        notes[0]=note1;
        notes[1]=note2;
        notes[2]=note3;
        notes[3]=note4;
    }
    public int comparer(etudiant e){
        return this.nom.compareToIgnoreCase(e.getNom());
    }
    public double moyenne(){
        return (notes[0]+notes[1]+notes[2]+notes[3])/Nbnotes;
    }
    public static int comparemoy(etudiant e1,etudiant e2){
        if(e1.moyenne()<e2.moyenne())
            return -1;
        else if(e1.moyenne()>e2.moyenne())
            return 1;
        return 0;
    }

}
