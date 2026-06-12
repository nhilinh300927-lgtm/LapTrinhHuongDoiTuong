package pro1;

public class Cat extends Animal {
    public String furColor; 

    public Cat() {
        super(); 
        this.furColor = "Unknown";
    }
    
    public void makeSound() {
    	System.out.println(name + " says: Meow!");
    }

    public Cat(String nameInput, int ageInput, float heightInput, double weightInput, String furColorInput) {
        super(nameInput, ageInput, heightInput, weightInput);
        this.furColor = furColorInput;
    }
    
    @Override
    public String toString() {
        return "Cat{name='" + name + "', age=" + age + ", furColor='" + furColor + "'}";
    }
}