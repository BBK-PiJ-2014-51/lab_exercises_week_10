package exercise8;
public abstract class FlyingAnimal extends AnimalAbst{

	public FlyingAnimal(String name) {
		super(name);
	}
	
	public void call(){
		System.out.println(name + " will come when tired.");
	}
	
}