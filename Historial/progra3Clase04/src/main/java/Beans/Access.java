/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beans;

import Pojos.Estudiante;
import Services.IEstudiante;

/**
 *
 * @author kembe
 */
public class Access implements IEstudiante {

    @Override
    public int Acces(Estudiante es) {
     
       if(es.getUser().equals("Kemberly") && es.getPassword().equals("123")){
           return 0;
       //SI LO QUE OBTIENE USUARIO ES IGUAL A LO QUE ESTA ENTRE PARENTESIS RETORNARA CERO Y NOS ADMITIRA EL ACCESO
       }else {
       return 1;
      //SINO NOS DEVOLVERA 1 Y DENEGARA EL ACCESO
      
       } 
    }
    
}
