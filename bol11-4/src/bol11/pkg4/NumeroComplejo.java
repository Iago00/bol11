/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol11.pkg4;

/**
 *
 * @author ipampillonvieitez
 */
public class NumeroComplejo {
    final NumeroComplejo CERO = new NumeroComplejo(0,0);
private double real;
private double imaginario;
    
    public NumeroComplejo(){
    }
    public NumeroComplejo(double real,double imaginario){
    this.imaginario=imaginario;
    this.real=real;
    }    

    public double getReal() {
        return real;
    }

    public double getImaginario() {
        return imaginario;
    }

    public NumeroComplejo add(NumeroComplejo c){
    c.imaginario=imaginario+c.imaginario;
    c.real=real+c.real;    
    return c;
    }
    
    @Override
    public String toString(){
    return (CERO.getImaginario()+","+CERO.getReal()+","+getReal()+","+getImaginario()); 
    }
}
