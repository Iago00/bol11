/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol11.pkg1;

/**
 *
 * @author ipampillonvieitez
 */
public class Bol111 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ClasseA a = new ClasseA();
        ClasseA b = new ClasseA(20);
        ClasseA c = new ClasseA(20,40);
        System.out.println("El objeto _a: _ contiene:" + a.getPrimari() + "," + a.getSecundari());
        System.out.println("El objeto _B: _ contiene:" + b.getPrimari() + "," + b.getSecundari());
        System.out.println("El objeto _c: _ contiene:" + c.getPrimari() + "," + c.getSecundari());
    }
    
}
