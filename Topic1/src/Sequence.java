/**
* @author Melina
* @version 1.0 Sinlgeton Pattern
*/

public class Sequence {
	private static Sequence instance = null;
	private static int counter;
	
	protected Sequence(){
	    counter = 0; 
	}
	
	public static Sequence getInstance(){
	    if(instance==null) {
	      instance = new Sequence();
	    }
	    return instance;
	}
	
	public static int getNext(){
	    return ++counter;
	}
	
	public int getCounter(){
		return counter;
	}
}
