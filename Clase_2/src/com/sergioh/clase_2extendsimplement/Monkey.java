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
public class Monkey extends Animal implements Pet{
    
    private String name;

    public Monkey() {
        super(2);
    }

    @Override
    public void eat() {
                System.out.println("Monkey eat bananas");

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public void play() {
                System.out.println(name + " play in the branches ");

    }
    
}
