package pro1;

public class Animal {
	public String name; //biến, đặc thù từng class
	public int age;
	public float height;
	public double weight; //double la float nhung co the bieu thi nhieu chu so thap phan hon
	
	public Animal(){ //constructor - 1 o đc tạo thì hàm này đc gọi, mục đích: gán giá trị cho biến
		this.name = "default";
		this.age = 10;
		this.height = 20;
		this.weight = 20;
	}
	
	public Animal(String nameInput, int ageInput, float heightInput, double weightInput){ //constructor - 1 o đc tạo thì hàm này đc gọi, mục đích: gán giá trị cho biến
// () laf parametor cua ham
		this.name = nameInput;
		this.age = ageInput;
		this.height = heightInput;
		this.weight = weightInput;
	}
	
	public int getAge() { //la 1 ham getter
		return this.age; // return age 
	}
	
	public void setAge(int newAge){ //setAge la 1 ham setter
		this.age = newAge;
	}
	
	public Animal(String nameInput, int ageInput) {
		this.name = nameInput;
		this.age = ageInput;
	}
	public void eat() {
		System.out.println(name + " is eating");
	}
	public String toString() {
		return "Animal{name='" + name + "', ages=" + age + "}";
	}
	
}
