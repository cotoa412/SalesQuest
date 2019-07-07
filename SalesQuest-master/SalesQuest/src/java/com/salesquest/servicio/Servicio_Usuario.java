/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.salesquest.servicio;
import com.salesquest.model.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Vigo02
 */
public class Servicio_Usuario extends Servicio implements IDAO{

    @Override
    public List<Object> mostrarDatos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertarDato(Object obj) {
       Statement stmt = null;
       try{
           this.conectar();//Me conecto a la base de datos.
           
           
           stmt = conn.createStatement();
           String sql = "INSERT INTO usuario(nombre, apellidos, correo, nombre_usuario, contrasenna, tipo_cliente) VALUE('"+((Usuario)obj).getNombre()+"','"+((Usuario)obj).getApellidos()+"','"+((Usuario)obj).getCorreo()+"','"+((Usuario)obj).getNombreUsuario()+"','"+((Usuario)obj).getContrasenna()+"','"+((Usuario)obj).getTipoUsuario()+"')";                                                                                                            
           int i = stmt.executeUpdate(sql);
       }catch(Exception e){
         e.printStackTrace();
       }
       finally{
           
       }
       try{
           stmt.close();
           
           this.desconectar();//Me desconecto.
       }catch (Exception e){
           e.printStackTrace();
       }
    }

    @Override
    public void actualizarDato(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminarDato(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

}
