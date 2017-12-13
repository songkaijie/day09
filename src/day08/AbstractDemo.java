package day08;

abstract class Animal{
	int age;
	String name;
	public Animal(String name){
		this.name = name;
		System.out.println("animal");
	}
	
	void  sleep(){
		System.out.println("sleep");
	}
}
class Cat extends Animal{
	public Cat(){
		super("Ð¡ºÚ");
		System.out.println("eat");
	}
}

public class AbstractDemo {
	public static void main(String[] args) {
		new Cat();
	}
}
