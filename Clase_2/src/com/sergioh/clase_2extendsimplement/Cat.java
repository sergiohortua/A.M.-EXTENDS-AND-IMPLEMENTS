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
public class Cat extends Animal implements Pet {

	private String name;

	public Cat() {
		this("Fluffy");
	}

	public Cat(String name) {
		super(4);
		this.name = name;
	}

	@Override
	public void eat() {
		System.out.println("Cats like to eat spiders and fish");
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void play() {
		System.out.println(name + " like to platy with balls");
	}

}
