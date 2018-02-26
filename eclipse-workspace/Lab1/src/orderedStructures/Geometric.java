package orderedStructures;

public class Geometric extends Progression {

	private double commonFactor; 
	
	public Geometric(double firstValue, double commonFactor) { 
		super(firstValue); 
		this.commonFactor = commonFactor; 
	}
	
	@Override
	public double nextValue() throws IllegalStateException {
		if(firstValueRunned==false){ 
			throw new IllegalStateException("Invalid state detected."); }
		current = current * commonFactor; 
		return current;
	}
	
	
	@Override
	public String toString(){
		return "Geom(" + (int) this.firstValue() + "," + (int) commonFactor + ")";	
	}
	
	@Override
	public double getTerm(int n) throws IndexOutOfBoundsException { 
		if (n <= 0) 
			throw new IndexOutOfBoundsException("printAllTerms: Invalid argument value = " + n); 		
				return this.firstValue()*Math.pow(commonFactor, n-1);
	}

}
