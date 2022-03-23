/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kemberly.BD;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author kembe
 */
public class ConexionAMYSQL {
    // 1º variable de Connection
    private static Connection ConnectionBD = null; // Variable especifica para la conexion (ConnectionBD) y retornara la conexion con el servidor de base de datos
    
    // 2º metodo tipo Conection  para obtener la conexion, retornarà los datos de la variable Connection
    public Connection getConecction (){
    try {//Colocar TRY {} CATCH{} para los metodos futuros 
        
        //String de conexion, con estos se conectara a la db como tal
            String url = "jdbc:mysql://localhost:3306/Clase"; /* "Archivo del driver a utilizar: servidor://ruta de ubicacion del servidor:puerto/ base de datos";    */
            String user = "amaya"; //Usuario del servidor
            String password = "root"; //Contraseña del servidor
                                          
            
            
            //3º Retornar conexion de la db, donde le pasaremos el Driver Manager. Esto se conectara con el servidor de MYSQL
            //Nos retornara la informacion en la varible colocada como nula en la parte de arriba,
                                         //Obtiene la conexion del servidor mediante el Driver Mannager
            ConnectionBD = DriverManager.getConnection(url, user, password); /*ubica el controlador para que se pueda conectar
            al servidor de base de datos 
            */
            System.out.println("Conexion Exitosa");
        } catch (Exception e) {
            //Mesaje de error por si llega a fallar
            JOptionPane.showMessageDialog(null, "error" + e.toString());
        }
    
            return ConnectionBD;
    
    }
}
