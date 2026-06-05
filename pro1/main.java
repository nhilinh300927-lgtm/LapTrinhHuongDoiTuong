package pro1;
import java.util.*; //lệnh thêm thuộc library vào 


public class main {  // class- lập trình hướng đối tượng 
// các từ khóa: public-cgi cx truy cập được, private-ko j truy cập đc ngoài bản thân nó
	public static void main(String[] args) { //string-data type
		// TODO Auto-generated method stub
		Animal a = new Animal(); //tao object moi
		Dog bong = new Dog("bong", 4, 30, 5, "Poodle");
		Cat pi = new Cat("pi", 3, 25, 5, "gray");
		System.out.println(pi.name);
		System.out.println(pi.age);
		System.out.println(pi.height);
		System.out.println(pi.weight);
		System.out.println(pi.furColor);
		System.out.println(bong);




	}

}
