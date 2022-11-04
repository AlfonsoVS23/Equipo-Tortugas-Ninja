package com.keepe.keepe.models;

public class Usuario {
    //*** Atributos de clase padre usuario ***
    int id;
    String correo;
    String contrasenia;
    int telefono;
    int rut;
    
    public Usuario() {
    }

    public Usuario(int id, String correo, String contrasenia, int telefono, int rut) {
        this.id = id;
        this.correo = correo;
        this.contrasenia = contrasenia;
        this.telefono = telefono;
        this.rut = rut;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public void modificarContrasenia(){
        System.out.println("modificar contraseña");
    }

    public void modificarTelefono(){
        System.out.println("modificar telefono");
    }

    public void modificarCorreo(){
        System.out.println("modificar Correo");
    }

    @Override
    public String toString() {
        return "Usuario [id=" + id + ", correo=" + correo + ", contrasenia=" + contrasenia + ", telefono=" + telefono
                + ", rut=" + rut + "]";
    }
    


}
