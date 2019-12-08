package org.sardar.java;

@FunctionalInterface
interface dogQuerier {
	boolean test(Dog g);
	default void testN() {
	}
}

public class DogQuerierTest {

	public static void main(String[] args) {
		Dog d1 = new Dog(4, 12);
		Dog d2 = new Dog(2, 7);

		dogQuerier doqRef = bb -> bb.getAge() >= 12;
		System.out.println(doqRef.test(d1));
		System.out.println(doqRef.test(d2));

	}

}

class Dog {

	public Dog(int id, int age) {
		super();
		this.id = id;
		this.age = age;
	}

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	private int age;

}
