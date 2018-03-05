package orderedStructures;

public class Fibonacci extends Progression {

	private double prev; 
	
	public Fibonacci() { 
		this(1); 
		prev = 0; 
	}
	private Fibonacci(double first) {
		super(first);
	}

	@Override
	public double nextValue() {
		double number = current + prev;
		prev= current;
		current = number;
		return current;
	}
	
	@Override	
	public double firstValue() { 
		double value = super.firstValue(); 
		prev = 0; 
		return value; 
	}
	@Override
	public boolean equals(Progression p) {

     return this.nextValue() == p.nextValue();

	}
	@Override
	public Progression add(Progression other) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Progression substract(Progression other) {
		// TODO Auto-generated method stub
		return null;
	}

}


