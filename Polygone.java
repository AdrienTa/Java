package Java;

public class Polygone extends Forme {
	/*private int nb_sommet;
	
	
	 public Polygone() {
	    	
	    }

	    public Polygone() {
	    
	    }
	    */
	    
	@Override
    public String toString() {
        return "(" + getCentre() +super.toString() + ")";
    }

	@Override
    public double surface() {
        return 0;
    }
    
	@Override
    public double perimetre() {
         return 0;
    }
}
