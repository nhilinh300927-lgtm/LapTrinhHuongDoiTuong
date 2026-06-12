package pro1;

public class Dog extends Animal {
    public String breed; 

    public Dog() {
        super(); 
        this.breed = "unknown";
    } 

    public void makeSound() {
        System.out.println(name + " says: Woof!"); 
    }
	
    public Dog(String nameInput, int ageInput, float heightInput, double weightInput, String breedInput) {
        super(nameInput, ageInput, heightInput, weightInput); 
        this.breed = breedInput; 
    }

    @Override
    public String toString() {
        return "Dog{name='" + name + "', age=" + age + ", breed='" + breed + "'}";
    }
}