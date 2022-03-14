/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entidades.Nota;
import com.kemberly.BD.ConexionAMYSQL;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author kembe
 */
public class Notas {
    
    //Select para inner join
     ConexionAMYSQL con = new ConexionAMYSQL();
    Connection conexion = con.getConecction(); //varible que retorne el metodo getConnection

    //EJEMPLO DE SELECT
    //Lista de tipo Estudiante con nombre Listado estudiante
    public ArrayList<Nota> ListadoNota() {
        //Retornar varaible de tipo ArrayList
        ArrayList<Nota> listado = null; //null porque no posee la accion de la instancia
        try {
            listado = new ArrayList<Nota>();

            /*Tipo de datos para generar consulta con la db*/
            CallableStatement cb = conexion.prepareCall("{ call SP_S_MOSTRARNOTA ()}");;
            /* prepareCall-->Generar consulta que nos devuelva la consulta
             */
            ResultSet resultado = cb.executeQuery();//Ejecucucion de la consulta, tipo de variable ResultSet 
            // Donde resultado es la variable que contiene la consulta y executeQuery es el q ejecuta la consulta.

            //ResulSet obtener resultados , dentro de este estaran las columnas obtenidas de la consulta
            
            
            //Ahora se pueden iterar estos resultados obtenidos a traves del ResultSet
            while (resultado.next()) {
                //next ---> darle segumiento al siguiente valor del seguimiento.
                Nota n = new Nota(); //Se hace la importacion para asignarle los datos obtenidos de la consulta
                n.setNombre(resultado.getString("Nota"));//Nombre de la columna que trae como parametro el ResultSet
                n.setApellido(resultado.getString("NombreMateria"));
                n.setNombreMateria(resultado.getString("Nombre"));
                listado.add(n);//agregar estos nombres  de la columna al listado

            }
        } catch (Exception e) {
            System.out.println(e.toString());

        }
        return listado;
    }
    
}
