package com.generation.firstproject.models;

public class Gato {
    String nombre;
    String raza;
    String cola;
    String bigotes;
    String pelaje; 

    void maullar(){
        System.out.println("miau");
    }
    void ronronear(){
        System.out.println("prrrrrrr");
    }
    String cazar(String tipoPresa){
        if(tipoPresa == "raton"){
            return "te traje un raton, miau";
        }
         return "no te traje nah, me das asco";
        }

    String jugar(String tipoJuego){
        if(tipoJuego == "atrapar raton"){
            return "atrapo raton, miau";
        }
         return "no te atrapo nah, me das asco";
        }

    String rascar(String objetoRascado){
        if(objetoRascado == "sillon"){
            return "rasco rasco el sillon, miau";
            }
             return "no tengo garras, me das asco";
            }
    }
    


