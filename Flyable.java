package carbuy;

public interface Flyable {
	void fly(); // abstract by default
	}

	class Airplane implements Flyable {
	    @Override
	    public void fly() {
	        System.out.println("Airplane is flying high in the sky.");
	    }
	}

/*
 * Abstract class can be used when you want to provide shared code like common methods or fields.
 * There is a clear "is-a" relationship between the base class and its subclasses.
 
 * Interface
 * 
 * You can use interface when you only need to specify method and signature, not actual code.
 * You want to define a contract or capability that can apply to unrelated classes.
 * You may want a class to implement multiple behaviors 
 * 
 */

