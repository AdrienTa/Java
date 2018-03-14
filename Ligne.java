package Java;

public class Ligne extends Forme{
	private final int ab;
	private final int or;
	private final int abb;
	private final int orr;
	
	public Ligne(){
		this(new Point(), 0,0);
	}
	
	public Ligne(Point a, int ab, int or)
	{
		super(a.getAbs(), a.getOrd());
		this.ab=ab;
		this.or=or;
		abb=a.getAbs();
		orr=a.getOrd();
	
    }
	
	@Override
	public double perimetre( ) {
		double x = ((abb) - (ab)) * ((abb) - (ab));
        double y = ((orr) - (or)) * ((orr) - (or));
        return Math.sqrt((x+y));
    }
	
	@Override
	public double surface() {
	    return 0;
	 }
	
	@Override
	public String toString() {
        return "(" +  getCentre() + "(" + ab + "," + or + ")" + "," + super.toString() +")" ;
    
}
	
}
