package twoChanes;

public class PairRunner {

	public static void main(String[] args) {


		Pair pair = new Pair(2, 3);
		
		pair.setY(6);
		
		System.out.println(pair.getY());
		
		System.out.println(pair.sum());
		
		System.out.println(pair.max());
		

	}

}
