package profesercizi;

import java.util.Scanner;
import java.util.ArrayList;
/*
 Crea un programma Film ogni film ha un titolo un regista e un anno di produzione (variabili di istanza). 
Implementare inoltre il metodo toString() che ritorna la visualizzazione del film.
Creare poi un main in cui crei un arraylist di film e un do while in cui l'utente:
se preme 0 termina il programma
se preme 1 stampa tutti i film 
se preme 2 crea un nuovo film (tramite gli input dello Scanner).
 */



public class film {

	String titolo;
	String regista;
	int anno;
	
	film(String titolo,String regista,int anno){
		
		this.titolo=titolo;
		this.regista=regista;
		this.anno=anno;
		
	}
	
	public String toString() {
		
		return titolo+"  "+regista+"  "+anno;
		
	}
	
		

	
public static void main(String[] args) {
	
	ArrayList<film>cinema= new ArrayList();

    film azione= new film ("diehard","arnold",1980);
    film commedia=new film("le comiche","fantozzi",1988);
    film horror=new film("bambola assassina","hitck",1990);
    
    cinema.add(azione);
    cinema.add(commedia);
    cinema.add(horror);
    
    
    int termina=0;
    int stampa=1;
    int crea=2;
    int scelta;
   do {
    System.out.println("1 visualizza film-2 aggiungi un film-0 termina");
  
    	Scanner sc = new Scanner(System.in);
	        scelta =sc.nextInt();
	       
	       
	        
	        
	        
	       
    if(scelta==1) {
    	
    	for(int a=0;a<cinema.size();a++)
    	
    		 System.out.println(cinema.get(a));
    	 
    }
    	
    else if(scelta==2){
    	
    	
    	
    	System.out.println("scrivi  film");
    	
    	Scanner scr = new Scanner(System.in);
        
    	 String titolo =scr.nextLine();
    	 System.out.println("scrivi  regista");
    	
    	 Scanner scrc = new Scanner(System.in);
         
    	 String regista =scrc.nextLine();
    	 System.out.println("scrivi  anno");
    	 Scanner s = new Scanner(System.in);
         
    	 int anno =s.nextInt();
    	 
    	 film utente=new film(titolo,regista,anno);
    	 
    	 cinema.add(utente);
    	 
    	 
      
    }
    }
 while(scelta!=0);
}
}


