package com.generation.firstproject.models;

public class AutitoDeJuguete {
    String marca;
    String tipoDeAutomovil;
    int ruedas;
    String bocina; 
    String motor;
    String luces;

    void Jugar(){
        System.out.println("rum rum juego con mi auto");
    }
    Boolean moverse(Boolean seMueve){
        if(true == seMueve){
            return seMueve;
        }
        return false;
    }

    void Adornar(){
        System.out.println("me paro y adorno");
    }
    void juntarPolvo(){
        System.out.println("junto polvo");
    }
    String sujetar(String sujeto){
        if(sujeto == "papeles"){
            return "me pongo arriba de papeles";
        }
        return "no me pongo";
    }
}
