package Java;

public class Cercle extends Forme {
    private final int rayon;

    public Cercle() {
    	this(new Point(), 0);
    }

    public Cercle(Point concours, int rayon) {
    	super(concours.getAbs(), concours.getOrd());
        this.rayon = rayon;
    }

	public int getRayon() {
		return rayon;
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
		Cercle other = (Cercle) obj;
		if (rayon != other.rayon) {
			return false;
		}
		return true;
	}
	
	@Override
    public String toString() {
        return "(" + getCentre() + ", " + rayon + ", " + super.toString() + ")";
    }

	@Override
    public double surface() {
        return Math.PI * rayon * rayon;
    }
    
	@Override
    public double perimetre() {
        return 2 * Math.PI * rayon;
    }
}