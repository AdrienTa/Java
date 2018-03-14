package Java;

import java.util.ArrayList;
import java.util.List;

public class Image {
	private List<Forme> formes;

	public Image() {
		formes = new ArrayList<Forme>();
	}

	public List<Forme> getFormes() {
		return formes;
	}
	
    public double somme(){
	    double somme=0;
	    for(Forme forme : formes){
	    	somme += forme.perimetre();
	    }
	    return somme;
	    }
    
    public double somme_sur(){
	    double somme=0;
	    for(Forme forme : formes){
	    	somme += forme.surface();
	    }
	    return somme;
	    }
	    

	public void add(Forme forme) {
		if (formes.contains(forme) == false)
			formes.add(forme);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder("[\n");

		Class<? extends Forme> c = null;
		for(Forme forme : formes){
			c = forme.getClass();
			sb.append(c.getSimpleName() + " : ");
			sb.append(forme).append("\n");
		}
		sb.append("]");
		return sb.toString();
	}
}