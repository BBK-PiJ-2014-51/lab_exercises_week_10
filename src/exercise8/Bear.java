package exercise8;
public class Bear extends LandAnimal implements Mammal{

	public Bear() {
		super("Bear");
	}

	@Override
	public void reproduce() {
		this.giveBirth();
	}

	@Override
	public void makeSound() {
		System.out.println("I'm a bear, rarrr!");
	}

	@Override
	public void giveBirth() {
		System.out.println("The " + name + " gives live birth.");
	}
	
}