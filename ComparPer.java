package Java;

import java.util.Comparator;

public class ComparPer extends Forme implements Comparator<Object>   {
	
	ComparPer()
	{
		
	}

	public int compare(Object arg0, Object arg1) 
	  {
	    Forme forme1 = (Forme) arg0;
	    Forme forme2 = (Forme) arg1;
	    
	    if (forme1.perimetre() > forme2.perimetre()) {
	        return +1;
	    }

	    if (forme1.perimetre() > forme2.perimetre()) {
	        return +1;
	    }
	    if (forme1.perimetre() == forme2.perimetre()) {
	        return 0;
	    }
	    return -1;

	  }

	@Override
	public double surface() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double perimetre() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int compareTo(Forme o) {
		// TODO Auto-generated method stub
		return 0;
	}


	
	
}