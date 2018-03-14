package Java;

	public class Point{
	    private final int abs;
	    private final int ord;

	    public Point(int abs, int ord) {
	        this.abs = abs;
	        this.ord = ord;
	    }

	    public Point() {
	        this(0,0);
	    }

	    public int getAbs() {
	        return abs;
	    }

	    public int getOrd() {
	        return ord;
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
			Point other = (Point) obj;
			if (abs != other.abs) {
				return false;
			}
			if (ord != other.ord) {
				return false;
			}
			return true;
		} 
		
	    @Override
	    public String toString() {
	        return "(" + this.abs + "," + this.ord + ")";
	    }
	    
	   
	    public double distance(Point p) {
	        double a = ((this.abs) - (p.abs)) * ((this.abs) - (p.abs));
	        double b = ((this.ord) - (p.ord)) * ((this.ord) - (p.ord));
	        return Math.sqrt((a+b));
	    }
 
}
