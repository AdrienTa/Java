package Java;


import java.util.Collections;
// java.util.List;
import java.util.Scanner;


public class Main {

	
    public static void main(String[] args) {
    	
    	Image image = new Image();
    	int cpt=0;
    	while (cpt!=1)
        {
    	System.out.println("Quelle forme voulez-vous ajouter à l'image:");
    	System.out.println("1-Ajouter une ligne");
    	System.out.println("2-Ajouter un cercle");
    	System.out.println("3-Ajouter une ellipse");
    	System.out.println("4-Ajouter un polygone");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        
        switch(i){
     	
        case 1:
        System.out.println("valeur du premier point :");
     	int a1 = sc.nextInt();
     	int a2 = sc.nextInt();
     	System.out.println("valeur du second point :");
     	int b1 = sc.nextInt();
     	int b2 = sc.nextInt();
     	image.add(new Ligne(new Point(a1,a2),b1,b2));
     	break;
        case 2:
       
        System.out.println("valeur du centre :");
		int c1 = sc.nextInt();
		int c2 = sc.nextInt();
		System.out.println("valeur du rayon :");
		int r = sc.nextInt();
        image.add(new Cercle(new Point(c1, c2), r));
        break;
        case 3:
        
            System.out.println("valeur du centre :");
    		int d1 = sc.nextInt();
    		int d2 = sc.nextInt();
    		System.out.println("valeur du rayon 1 :");
    		int r1 = sc.nextInt();
    		System.out.println("valeur du rayon 2 :");
    		int r2 = sc.nextInt();
           // Ellipse ellipse = new Ellipse(new Point(a, b), c,d);
            image.add(new Ellipse(new Point(d1, d2), r1,r2));
            break;
        }
        System.out.println("voulez-vous ajouter une forme? 0-oui 1-non");
        int reponse = sc.nextInt();
        if(reponse==1){
        	cpt=cpt+1;
        }
        else
        {
        	cpt=0;
        }          
}
    	

    			
        System.out.println("**********LA COLLECTION DE FORMES ******************************************************");
        System.out.println(image);
        
        Collections.sort(image.getFormes());
        System.out.println("**********LA COLLECTION DE FORMES TRIEE selon l'ordre croissant de leurs surfaces ******");
        System.out.println(image);
        
        Collections.sort(image.getFormes(), new ComparPer());
        System.out.println("**********LA COLLECTION DE FORMES TRIEE selon l'ordre croissant de leurs perimetres ******");
		System.out.println(image);
		
		Collections.sort(image.getFormes(), new ComparDis());
        System.out.println("**********LA COLLECTION DE FORMES TRIEE selon l'ordre croissant de leurs distances à l'origine ******");
		System.out.println(image);
        
        System.out.println("Somme des perimetre = " + image.somme());
        System.out.println("Somme des surfaces = " + image.somme_sur());
    
    }
   
	
}