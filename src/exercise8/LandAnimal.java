package exercise8;
public abstract class LandAnimal extends AnimalAbst{

	public LandAnimal(String name) {
		super(name);
	}
	
	public void call(){
		System.out.println(name + "coming...");
	}
}