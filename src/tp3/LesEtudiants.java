package tp3;

import java.io.File;
import java.io.PrintWriter;

public class LesEtudiants {
    private int dim;
    private etudiant[] cont;
    private int der=0;
    
    public LesEtudiants(){}
    public LesEtudiants(int dim){
        this.dim=dim;
    }
    public LesEtudiants(int dim,int der){
        this.dim=dim;
        this.der=der;
    }
    public LesEtudiants(int dim,int der,etudiant[] cont){
        this.dim=dim;
        this.der=der;
        this.cont=cont;
    }
    public int getDim(){
        return dim;
    }
    public int getDer(){
        return der;
    }
    public etudiant[] getCont(){
        return cont;
    }
    public void setDim(int dim){
        this.dim=dim;
    }
    public void setDer(int der){
        this.der=der;
    }
    public void setCont(etudiant[] cont){
        this.cont=cont;
    }
    public void ajouter(etudiant e){
        assert der<dim-1;
        int i=der;
        while(i>=0 && e.getCode() < cont[i].getCode() ){
            cont[i+1]=cont[i];
            i--;
        }
        cont[i+1]=e;
        der++;
    }
    public void stocker(File f,double m1,double m2) throws Exception{
        PrintWriter out=new PrintWriter(f);
        for(int i=0;i<=0;i++){
            if(cont[i].moyenne()>=m1 && cont[i].moyenne()<m2)
                out.print(cont[i].getNom());//out.print(cont[i].toString());
            out.close();
        }
        
        
    }

}
