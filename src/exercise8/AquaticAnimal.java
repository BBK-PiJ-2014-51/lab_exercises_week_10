package exercise8;
public abstract class AquaticAnimal extends AnimalAbst{

	public AquaticAnimal(String name) {
		super(name);
	}
	
	public void call(){
		System.out.println(name + " will not come.");
	}
	
}