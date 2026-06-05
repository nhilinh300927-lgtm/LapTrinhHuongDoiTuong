package pro1;

public class Dog extends Animal {
	public String breed; 
	public Dog() {
		super();
		this.breed = "unknow";
		
	}
	
	public Dog(String nameInput, int ageInput, float heightInput, double weightInput, String breedInput) {
        super(nameInput, ageInput, heightInput, weightInput, breedInput); 
        this.breed = breedInput; 
    }
	@Override
    public String toString() {
        return "Dog{name='" + name + "', age=" + age + "}";
    }

}
