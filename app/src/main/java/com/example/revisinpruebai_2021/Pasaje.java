package com.example.revisinpruebai_2021;

import java.io.Serializable;

public abstract class Pasaje implements Serializable {

    protected String fecha;
    protected int valor;

    public Pasaje(){
        fecha = "Jueves";
        valor = 0;
    }

    public final String getFecha(){
        return fecha;
    }

    public final int getValor(){
        return valor;
    }

    public abstract String adicional();

}
