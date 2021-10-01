package com.example.revisinpruebai_2021;

import java.io.Serializable;
import java.util.Random;

public class PasajeTaxi extends Pasaje implements Serializable {

    private int id_secreto;

    public PasajeTaxi(){
        valor = 600;

        Random r = new Random();

        id_secreto = r.nextInt();
        if(id_secreto < 0){
            id_secreto *=-1;
        }

    }

    @Override
    public String adicional() {
        return "id secreto: "+id_secreto;
    }
}
