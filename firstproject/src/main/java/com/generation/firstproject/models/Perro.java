package com.generation.firstproject.models;

public class Perro {
    String nombre;
    String pelaje;
    String raza;
    Boolean vacunado; 

    void ladrar(){
        System.out.println("guau");
    }
    void caminar(){
        System.out.println("dar un pasito");
    }
    String truco(String tipoTruco){
        if(tipoTruco == "da la pata"){
            return "doy la pata";
        }
        return "no hago nada :C";
    }
}
