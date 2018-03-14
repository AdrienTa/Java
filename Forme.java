	package Java;

public  abstract class Forme implements Comparable<Forme>{
		
	    private final Point centre;
	    private final static Point origine = new Point();

	    public abstract double surface();
	    public abstract double perimetre();
	    
	    public Forme(int abs, int ord) {
	        centre = new Point(abs,ord);
	    }
	    
	    public Forme() {
	        this(0, 0);
	    }
	    
	    public Point getCentre() {
			return centre;
		}

		public static Point getOrigine() {
			return origine;
		}
		
		
	    public double distanceOrigine() {
	        return centre.distance(origine);
	    }

	    @Override
		public boolean equals(Object obj) {
			if (this == obj) {
				return true;
			}
			if (obj == null) {
				return false;
			}
			if (getClass() != obj.getClass()) {
				return false;
			}
			Forme other = (Forme) obj;
			if (centre == null) {
				if (other.centre != null) {
					return false;
				}
			} else if (!centre.equals(other.centre)) {
				return false;
			}
			return true;
		}
		
	    @Override
	    public String toString() {
	        return String.format("aire: %.2f", surface()) + ", " 
	        		+ String.format("perimetre: %.2f", perimetre()) + ", " 
	        		+ String.format("distance au centre: %.2f", distanceOrigine());
	    }
	    
	
	    
	    public int compareTo(Forme o) {
	    	 
	        
	        if (o.surface() > o.surface()) {
	            return +1;
	        }
	        if (o.surface() == o.surface()) {
	            return 0;
	        }
	        return -1;
	    }
	 
			
	    
	}

