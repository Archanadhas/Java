package Super_Class;

public class Dog extends Animal {
	void eat() {
		System.out.println("eating dog");
	}
	void bark() {
		System.out.println("eating barking");
		
	}
	void work() {
		eat();
		bark();
		super.eat();
	}

}
