package com.example.revisinpruebai_2021;

import java.io.Serializable;

public class PasajeMetro extends Pasaje implements Serializable {

    public PasajeMetro(){
        valor = 750;
    }

    @Override
    public String adicional() {
        return "";
    }
}
