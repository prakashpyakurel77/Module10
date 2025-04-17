package carbuy;

abstract class Car {
    String name;

    public Car(String name) {
        this.name = name;
    }

    public void park() {
        System.out.println(name + " is in park.");
    }

    public abstract void makeSound(); // abstract method
}

class Nissan extends Car {
    public Nissan(String name) {
		super(name);
		
	}

	@Override
    public void makeSound() {
        System.out.println(name + " says: Vroom!");
    }
}