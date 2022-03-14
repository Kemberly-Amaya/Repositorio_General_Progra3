/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entidades.Estudiante;
import com.kemberly.BD.ConexionAMYSQL;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author kembe
 */
public class Estudiantes {
    //Retornar GetConnection con estas instancias.

    ConexionAMYSQL con = new ConexionAMYSQL();
    Connection conexion = con.getConecction(); //varible que retorne el metodo getConnection

    //EJEMPLO DE SELECT
    //Lista de tipo Estudiante con nombre Listado estudiante
    public ArrayList<Estudiante> ListadoEstudiantes() {
        //Retornar varaible de tipo ArrayList
        ArrayList<Estudiante> listado = null; //null porque no posee la accion de la instancia
        try {
            listado = new ArrayList<Estudiante>();

            /*Tipo de datos para generar consulta con la db*/
            CallableStatement cb = conexion.prepareCall("{call SP_S_ESTUDIANTE()}");
            /* prepareCall-->Generar consulta que nos devuelva la consulta
             */
            ResultSet resultado = cb.executeQuery();//Ejecucucion de la consulta, tipo de variable ResultSet 
            // Donde resultado es la variable que contiene la consulta y executeQuery es el q ejecuta la consulta.

            //ResulSet obtener resultados , dentro de este estaran las columnas obtenidas de la consulta
            
            
            //Ahora se pueden iterar estos resultados obtenidos a traves del ResultSet
            while (resultado.next()) {
                //next ---> darle segumiento al siguiente valor del seguimiento.
                Estudiante es = new Estudiante(); //Se hace la importacion para asignarle los datos obtenidos de la consulta
                es.setNombre(resultado.getString("nombre"));//Nombre de la columna que trae como parametro el ResultSet
                es.setApellido(resultado.getString("apellido"));
                listado.add(es);//agregar estos nombres  de la columna al listado

            }
        } catch (Exception e) {
            System.out.println(e.toString());

        }
        return listado;
    }
    
    
    //Metodo Insertar 
    
    public void AgregarEstudiante(Estudiante es){
        
        try{
            CallableStatement cb = conexion.prepareCall("{call SP_I_ESTUDIANTE(?,?)}");
            cb.setString("PNombre", es.getNombre());
            cb.setString("PApellido", es.getApellido());
            cb.execute();
            
            JOptionPane.showMessageDialog(null, "Agregado", "Mensaje de Sistema", 1);
      
        }catch(SQLException ex){
           JOptionPane.showMessageDialog(null, "Error", "Mensaje de Sistema", 1);
        
        }
    
    
    }
  
}
