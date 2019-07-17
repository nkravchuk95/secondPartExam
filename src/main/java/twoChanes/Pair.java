package twoChanes;

public class Pair {

	public double x, y;


	public Pair() {
		
	}
	public Pair(int x, int y) {
		
		this.x = x;
		this.y = y;
		
	}

	public double getX() { 
		return x; 
	}
	
	public void setX(double v) { 
		x = v; 
	}
	

	public double getY() { 
		return y; 
	}
	
	public void setY(double v) { 
		y = v; 
	}

	public double sum() { 
		return x + y; 
	} 
	
	public double max() { 
		return (x > y ? x : y); 
		
	}
	



}


