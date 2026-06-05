package pro1;

public class Cat extends Animal {
    public String furColor; 

    public Cat() {
        super(); 
        this.furColor = "Unknown";
    }

    public Cat(String nameInput, int ageInput, float heightInput, double weightInput, String furColorInput) {
        super(nameInput, ageInput, heightInput, weightInput, furColorInput);
        this.furColor = furColorInput;
    }
}