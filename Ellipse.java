package Java;

public class Ellipse extends Forme {
	    private final int rayon1;
	    private final int rayon2;


	    public Ellipse() {
	    	this(new Point(), 0,0);
		}

		public Ellipse(Point concours, int rayon1, int rayon2) {
	    	super(concours.getAbs(), concours.getOrd());
	        this.rayon1 = rayon1;
	        this.rayon2 = rayon2;
	    }

		public int getRayon() {
			return rayon1;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj) {
				return true;
			}
			if (!super.equals(obj)) {
				return false;
			}
			if (getClass() != obj.getClass()) {
				return false;
			}
			Ellipse other = (Ellipse) obj;
			if (rayon1 != other.rayon1||rayon2 != other.rayon2) {
				return false;
			}
			return true;
		}
	
		@Override
		public String toString() {
		       return "(" + getCentre() + ", " + rayon1 + ", " + rayon2 + "," +super.toString() + ")";
		   }

		@Override
		public double surface() {
		       return Math.PI *rayon1*rayon2;
		   }
		    
		@Override
		public double perimetre() {
		       return  2*Math.PI*(float)Math.sqrt(0.5*((float)Math.pow(rayon1,2)+(float)Math.pow(rayon2,2)));
		   }
	    
}