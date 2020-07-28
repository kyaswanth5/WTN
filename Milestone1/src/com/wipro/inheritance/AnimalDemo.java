package com.wipro.inheritance;

public class AnimalDemo {
	void eat() {
		System.out.println("eat method");
	}
	void sleep() {
		System.out.println("Sleep method");
	}
}
class Bird extends Animal{
	void eat() {
		System.out.println("Override eat method");
	}
	void sleep() {
		System.out.println("Override sleep method");
	}
	void fly() {
		System.out.println("Fly method");
	}
}
class Animal{
	public static void main(String args[])
	{
		AnimalDemo a=new AnimalDemo();
		Bird b=new Bird();
		a.eat();
		a.sleep();
		b.eat();
		b.sleep();
		b.fly();
	}
}
