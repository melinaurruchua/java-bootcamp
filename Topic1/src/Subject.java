/**
* @author Melina
* @version 1.0 Observer Pattern
*/ 

public interface Subject {
	public void addObserver(Observer o);
	public void removeObserver(Observer o);
	public void notify(String g);
}
