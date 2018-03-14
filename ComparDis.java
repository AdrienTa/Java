package Java;

import java.util.Comparator;

public class ComparDis extends Forme implements Comparator<Object>   {
		
	ComparDis()
		{
			
		}

		public int compare(Object arg0, Object arg1) 
		  {
		    Forme forme1 = (Forme) arg0;
		    Forme forme2 = (Forme) arg1;
		    
		    if (forme1.distanceOrigine() > forme2.distanceOrigine()) {
		        return +1;
		    }

		    if (forme1.distanceOrigine() > forme2.distanceOrigine()) {
		        return +1;
		    }
		    if (forme1.distanceOrigine() == forme2.distanceOrigine()) {
		        return 0;
		    }
		    return -1;

		  }

		@Override
		public double surface() {
			return 0;
		}

		@Override
		public double perimetre() {
			return 0;
		}

		@Override
		public int compareTo(Forme o) {
			return 0;
		}


		
		
	}