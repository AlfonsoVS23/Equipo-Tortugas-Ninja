package com.generation.firstproject.models;

public class Celular {
    String forma;
    String pantalla;
    String audio;
    String botones;
    String camara;

    void llamar(){
        System.out.println("Llamando");
    }
    void fotografiar(){
        System.out.println("Sacando fotos");
    }
    void ilumunar(){
        System.out.println("te ilumino");
    }
    void textear(){
        System.out.println("enviando mensaje");
    }
    String ver(String queVeo){
        if(queVeo == "Pelicula"){
            return "Veo en Netflix";
        }
        return "no veo nada";
    }
    
}
