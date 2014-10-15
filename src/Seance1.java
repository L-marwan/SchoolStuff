import java.io.File;
import java.util.Scanner;


public class Seance1 {
	
	public static int min ( int[] t , int i , int j ){ // min retourne l'indice de l'element min dans t 
		 int min =0;
		 for (int k=0 ; k<j ; k++) if (t[k]<t[min]) min=k;
		 return min;
	}
	
	public static int localiser (int x,int[] t  ,int i , int j){ // localiser retourne l'indice de x dans t sinon -1
		
		for(int k=0 ; k<j ; k++) if(t[k] == x) return k;
		return -1;	
	}
	
	public static int occ ( String x , String[] t){ // occ retourne le nombre d'occurance de x dans t 
		int c=0;
		for (String s : t) if (x.equalsIgnoreCase(s)) c++; // parcour des elements du table avec for each
		return c;
	}
	
	public static boolean palindrome (String s){ //plaindrome tests si s est un palindrome ou pas
		String inv =""; // inv contient l'inverse de s 
		for (int i = s.length() ; i >0 ; i--) inv = inv + s.charAt(i); 
		if (s.equalsIgnoreCase(inv)) return true;
		return false;	
	}
	

	
	public static boolean permutable ( int [] t1 , int [] t2){ // permutable test si les deux tablaux ont les memes elements
		for ( int a : t1) if (localiser(a,t2,0,t2.length) == -1) return false; // en test chaque element de t1 dans t2 utilisant localiser
		return true;
	}
	
	public static int compter (File f) throws Exception {
		Scanner s = new Scanner(f);
		int c=0;
		while(s.hasNext()){
			c++;
			s.next();
		}
		s.close();
		return c;
	}
	
	public static String [] tran (File f) throws Exception{ //trans transfert les mots d'un fichier vers un tableau
		Scanner s = new Scanner(f);
		String [] t = new String[compter(f)];
		int i=0;
		while (s.hasNext()){
			t[i] = s.next();
			i++;
		}
		s.close();
		 return t;	
	}
	
	public static void main (String[] args) throws Exception{
		File f= new File ("test.txt");
		String[] t= tran(f);

		for (String i : t ) System.out.println( i +"\n");
		
		
	}
	
	
	
	
	
	

}
