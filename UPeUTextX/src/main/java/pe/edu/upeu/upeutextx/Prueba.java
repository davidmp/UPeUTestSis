/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.upeutextx;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alumno
 */
public class Prueba {
private static final Logger LOGGER = Logger.getLogger( Prueba.class.getName() );    
    
public static void main(String[] a){
//    System.out.println("Holas Mundo");
LOGGER.info("Hola Mundo");
LOGGER.log( Level.FINE, "Hola Mundo");

    
}
    
}
