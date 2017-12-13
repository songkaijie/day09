package day08;

class Person{
	int age;
	public Person(int age){
		this.age = age;
	}
	@Override
	public boolean equals(Object obj) {
		Person p = (Person)obj; //ǿת
		return this.age == p.age;
	}
//	@Override
//	public int hashCode() {
//		return 100;
//	}
//	@Override
//	public String toString() {
//		return "hello";
//	}
}
public class ObjectDemo {
	public static void main(String[] args) {
		Person p = new Person(10);
		Person p1 = new Person(15);
//		System.out.println(Integer.toHexString(p.hashCode()));
//		System.out.println(Integer.toHexString(p1.hashCode()));
//		System.out.println(p.toString());
//		System.out.println(p1.toString());
		System.out.println(p.equals(p1)); // return this == obj
		
	}
}
