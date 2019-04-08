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
public class Bird extends Animal implements Pet {

	private String name;

	public Bird() {
		this("Woody");
	}

	public Bird(String name) {
		super(2);
		this.name = name;
	}

	public Bird(int legs) {
		super(legs);
	}

	@Override
	public void eat() {
		System.out.println("Bird like to eat corn");

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
		System.out.println(name + " the heavens fly");

	}

}
