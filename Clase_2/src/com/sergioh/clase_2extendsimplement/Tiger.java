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
public class Tiger extends Animal  {

    public Tiger() {
        super(4);
    }

    @Override
    public void eat() {
        System.out.println("The tiger eats a zebra");
    }
    
}
