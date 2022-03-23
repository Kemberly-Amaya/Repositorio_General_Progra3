/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author kembe
 * Nota ....--- Pueda aceptar el inner join del id de la materia como el id del estudiante.
 * 
 * Hacemos una extension al Estudiante, esto permite la obtencion automatica del estudiante y al implemntar de otra clase
 * 
 */
public class Nota extends Estudiante {
    String nota;

    public String getNota() {
        return nota;
    }

    //Haciendo relacion de tablas (inner join)
    public void setNota(String nota) {
        this.nota = nota;
    }
    
    
    
    
}
