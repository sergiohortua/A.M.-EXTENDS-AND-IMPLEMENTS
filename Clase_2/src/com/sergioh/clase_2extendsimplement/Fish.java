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
public class Fish extends Animal implements Pet {

	protected String name;

	public Fish() {
		super(0);
	}

	@Override
	public void eat() {
		System.out.println("Fish eat pond scum");
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
		System.out.println(name + " Just keep swimming");
	}

	@Override
	public void walk() {
		super.walk();
		System.out.println("Fish, of course, can´t walk. The swim");
	}

}
