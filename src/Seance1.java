import java.io.File;
import java.io.PrintWriter;
import java.util.Random;
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
	
	public static void ecrire (File f, String [] s) throws Exception {
		// cette methode permet d'ecrire dans un fichier sans suprimmer ce qu'il ya deja dedans
		PrintWriter p = new PrintWriter (f);
		for (String w : s) p.println(w);
		p.close();
	}
	
	public static  int [] remplir (int n ){ // fonction qui remplit un tableau de taille i avec des nombres aleatoires
									// pour tester les rest des methodes de cette classe 
		int [] T = new int [10];
		Random rand = new Random ();
		for (int i =0 ; i < T.length ; i++) T[i] = rand.nextInt() % 100; // pour avoir des valeur entre -100 et 100
		
		return T;
		
	}
	
	
	
	public static void main (String[] args) throws Exception{
		
		int [] T = remplir(10); // pour avoir un tableau de taille 10 ( on ne doit pas remplir le tableau nous méme chaque foi )
		
		for (int i : T) System.out.print( i + ";"); // pour voir le tableau
		System.out.println(" ");
		System.out.println("l'index du min du tab est : " + min(T,0,T.length)); // tester la méthode min 
		System.out.println("------");
		
		int x = 15; // le valeur a cherecher
	
		T[5]=15; // pour etre sur que la valeur est dans le tab , on peut supp cette ligne
		System.out.print( "le nouveau tab : "); 
		for (int i : T) System.out.print( i + ";"); 
		System.out.println("x se trouve à l'index : "+localiser(x,T,0,T.length));
		
		
		File f= new File ("test.txt"); //ouvrir le fichier test.txt, ou bien le créer s'il n'existe pas
		File f1= new File ("test1.txt"); // le meme pour test1.txt
		String[] t= tran(f); // créer un tabeau de String a partir des mot du fichier test.txt
		ecrire(f1 ,t); // remplir le ficher test1.txt avec les mots du t 
		t = tran (f1); 
		System.out.println("------");
		System.out.println("Le fichier test1.txt contient : "); 
		for (String i : t ) System.out.println( i +"\n"); // afficher le contenu du tab t 
		
		
	}
	
	
	
	
	
	

}
