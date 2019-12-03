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
public class Bol114 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NumeroComplejo complejo1 = new NumeroComplejo();
       NumeroComplejo c = new NumeroComplejo(50.8,10.1);
       complejo1.add(c);
       System.out.println(complejo1.toString());
    }
    
}
