package com.classes;


public class Test
{
	public static void main(String args[]){
		Dog dog = new Dog();
		Bird bird = new Bird();
		Animal anim = new Animal();
		System.out.println("editing: "+(dog  instanceof Dog));
		System.out.println(dog  instanceof Animal);
		System.out.println(bird instanceof Animal);
		System.out.println(anim instanceof Dog);
		System.out.println(anim instanceof Bird);
		System.out.println(anim instanceof Dog);
	}
}

class Animal{}
class Dog extends Animal{}
class Bird extends Animal{}
