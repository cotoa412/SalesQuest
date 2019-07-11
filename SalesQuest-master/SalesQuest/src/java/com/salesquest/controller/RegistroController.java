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
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
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
        
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", "Registro completo."));
        
        usuario.setNombre("");
        usuario.setApellidos("");
        usuario.setCorreo("");
        usuario.setNombreUsuario("");
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Correct", "Correct");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
     
    public String volverInicio(){
        usuario.setNombre("");
        usuario.setApellidos("");
        usuario.setCorreo("");
        usuario.setNombreUsuario("");
    return "index.xhtml?faces-redirect=true";
    
    }
    public void submit() {
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Correct", "Correct");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
}
