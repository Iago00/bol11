/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol11.pkg2;

/**
 *
 * @author ipampillonvieitez
 */
public class Bol112 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Media obx1 = new Media();
       obx1.setAutor("Jose Roberto");
       obx1.setNom("La piedrita");
       obx1.setDuradaSegons(34);
        System.out.println("AUTOR: "+obx1.getAutor()+"\nNombre : "+obx1.getNom()+"\nDuración : "+obx1.getDurada());
    }
    
}
