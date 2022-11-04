package com.keepe.keepe.models;

public class Admin extends Usuario{

    public Admin() {
        super();
    }

    public Admin(int id, String correo, String contrasenia, int telefono, int rut) {
        super(id, correo, contrasenia, telefono, rut);
    }
    
    public void ModificarReservas () {
        System.out.println("Modificar reservas");
    }
    public void AgregarRecintos () {
        System.out.println("Agrega Recintos");
    }

    public void VerificarCodigo () {
        System.out.println("Verifica Código");
    }

    public void VerificarDocumentacion () {
        System.out.println("Verificar documentación");
    }

    @Override
    public String toString() {
        return super.toString() + "," + "Admin []";
    }
    


}
