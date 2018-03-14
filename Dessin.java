package Java;

import java.util.ArrayList;
import java.util.List;

public class Dessin {
	private List<Image> dessin;
	
	public Dessin(){
		dessin = new ArrayList<Image>();
		
	}
	
	public void afficherDessin(){
		
	}
	
    public void addImage(Image img){
			dessin.add(img);
    }


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("");
		for( Image a : dessin){
			sb.append(a.toString()).append("\n");
		}
		sb.append("\n");
		return sb.toString();

	}

}