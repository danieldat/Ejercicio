/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libros3;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 *
 * @author alumnot
 */
public class Stante {

    public Stante() {
    }

    ;


 
   public void recorro(ArrayList b) {

        ListIterator<Object> corro = b.listIterator();

        while (corro.hasNext()) {
            System.out.println(corro.next());
        }

    }

    public void come(Object x, ArrayList b) {

        if (b.size() < 15) {

            b.add(x);
        } else {
            System.out.println("Estante lleno");
        }

    }

    public static void main(String[] args) {

        ArrayList<Object> baul = new ArrayList<Object>();

        baul.ensureCapacity(15);

        Juego a1 = new Juego("Zelda", "Miyamoto", 356);
        Chanson c1 = new Chanson("ne me oublie pas", "Pablo Alboran", 300);
        Juego a2 = new Juego("FF IX", "Taito tikario", 450);
        Chanson c2 = new Chanson("Miedo", "Amaia Romero", 250);
        Juego a3 = new Juego("Donkey Kong", "Miyamoto", 300);
        Chanson c3 = new Chanson("Hasta que el cuerpo aguante", "Mägo de Oz", 600);
        
        Stante ocio=new Stante();
        
        ocio.come(c1, baul);
        ocio.come(c2, baul);
        ocio.come(c3, baul);
        ocio.come(a1, baul);
        ocio.come(a2, baul);
        ocio.come(a3, baul);
        
        ocio.recorro(baul);
        
        for( Object i : baul){
        
        System.out.println();
        
        }
        
        
        
        
        
        

    }

}
