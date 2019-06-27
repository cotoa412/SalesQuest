/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.salesquest.controller;

import com.salesquest.model.Usuario;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Laboratorio
 */
@ManagedBean(name = "registroController")
@SessionScoped
public class RegistroController {
    
    public Usuario usuario = new Usuario();
    
    public RegistroController(){
    
        Usuario usuario = new Usuario();
        
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public void aceptar(){
        
        System.out.println(usuario);
   
    }
    
    
    
    
}
