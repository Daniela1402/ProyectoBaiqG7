/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai.proyectobaiq.controlador;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author ADMIN
 */
@Named(value = "testRequest")
@RequestScoped
public class TestRequest {
    private String nombreUsuario ="";
    private String Clave ="";
    
    

    /**
     * Creates a new instance of TestRequest
     */
    public TestRequest() {
    }
    
    public void datosFormulario(){
        System.out.println("Su nombre es : " + this.nombreUsuario + "Su clave es : " + this.Clave);
        this.nombreUsuario = "";
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }
    
}
