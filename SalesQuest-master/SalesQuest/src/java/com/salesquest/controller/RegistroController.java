/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.salesquest.controller;

import com.salesquest.model.Usuario;
import com.salesquest.servicio.Servicio_Codigo;
import com.salesquest.servicio.Servicio_Usuario;
import com.salesquest.model.Codigo;
import java.util.Properties;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio
 */
@ManagedBean(name = "registroController")
@SessionScoped
public class RegistroController {
    
    private Usuario usuario = new Usuario();
   
    
    public RegistroController(){
    
        Usuario usuario = new Usuario();
        
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public void registrar(){
        
        Servicio_Usuario su = new Servicio_Usuario();
        su.insertarDato(usuario);
        
        usuario = null;
   
    }
     
}
