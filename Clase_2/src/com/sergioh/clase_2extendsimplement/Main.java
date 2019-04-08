/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sergioh.clase_2extendsimplement;

/**
 *
 * @author PC-48
 */
public class Main {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {

		Animal a;
		Spider s = new Spider();
		s.eat();
		s.walk();

		System.out.println("");
		a = new Spider();
		a.eat();
		a.walk();

		System.out.println("");

		Pet p;
		Cat c = new Cat("Felix");
		c.eat();
		c.walk();
		c.play();

		System.out.println("");
		a = new Cat();
		a.eat();
		a.walk();

		System.out.println("");
		p = new Cat();
		p.setName("Mr. Whiskers");
		p.play();
		System.out.println("");

		Fish f = new Fish();
		f.setName("Nemo");
		f.eat();
		f.walk();
		f.play();

		System.out.println();
		System.out.println("====Tres Nuevos Animales====");
		System.out.println();

		Monkey m = new Monkey();
		System.out.println("Primer Monkey");
		m.eat();
		m.setName("Jorge");
		m.play();
		m.walk();
		System.out.println();

		System.out.println("========");
		Bird b = new Bird();
		b.eat();
		b.getName();
		b.play();
		b.walk();
		System.out.println("========");
		Bird b2 = new Bird("Blue");
		b2.eat();
		b2.play();
		b2.walk();
		System.out.println("========");
		System.out.println();

		Dog d = new Dog();
		d.setName("Killer");
		d.play();
		System.out.println("========");

		System.out.println();
		p = new Dog();
		p.setName("Luna");
		p.play();

		System.out.println("========");
		playWhithAnimals(s);
		playWhithAnimals(c);
		playWhithAnimals(f);
		playWhithAnimals(b);
		playWhithAnimals(b2);
		playWhithAnimals(m);

	}

	public static void playWhithAnimals(Animal a) {

		if (a instanceof Pet) {
			Pet p = (Pet) a;
			p.play();
		} else {
			System.out.println("Danger  , wild animal");
		}

	}

}
