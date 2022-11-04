package com.keepe.keepe.models;

public class Cliente extends Usuario{
    Boolean Reservar;
    Double Pago;
    String Codigo;
    
    public Cliente() {
        super();
    }

    public Cliente(int id, String correo, String contrasenia, int telefono, int rut, Boolean reservar, Double pago,
            String codigo) {
        super(id, correo, contrasenia, telefono, rut);
        Reservar = reservar;
        Pago = pago;
        Codigo = codigo;
    }

    public Boolean getReservar() {
        return Reservar;
    }

    public void setReservar(Boolean reservar) {
        Reservar = reservar;
    }

    public Double getPago() {
        return Pago;
    }

    public void setPago(Double pago) {
        Pago = pago;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String codigo) {
        Codigo = codigo;
    }
    
    public void verCodigo(){
        System.out.println("Ver código");
    }

    @Override
    public String toString() {
        return super.toString() + "," + "Cliente [Reservar=" + Reservar + ", Pago=" + Pago + ", Codigo=" + Codigo + "]";
    }
    
}