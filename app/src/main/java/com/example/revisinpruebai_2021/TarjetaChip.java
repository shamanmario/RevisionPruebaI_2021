package com.example.revisinpruebai_2021;

import java.util.ArrayList;

public class TarjetaChip {

    private ArrayList<Pasaje> viajesMetro;
    private ArrayList<Pasaje> viajesTaxi;

    private int saldo;


    public TarjetaChip(){
        viajesMetro = new ArrayList<Pasaje>();
        viajesTaxi = new ArrayList<Pasaje>();
        saldo = 0;

    }

    public TarjetaChip(int cargaInicial){
        saldo = cargaInicial;
        viajesMetro = new ArrayList<Pasaje>();
        viajesTaxi = new ArrayList<Pasaje>();
    }

    public ArrayList<Pasaje> getViajesMetro() {
        return viajesMetro;
    }

    public ArrayList<Pasaje> getViajesTaxi() {
        return viajesTaxi;
    }

    public int getSaldo() {
        return saldo;
    }

    public boolean cargarChip(int carga){
        if(carga >= 1000){
            saldo += carga; //saldo = saldo + carga
            return true;
        }

        return  false;
    }

    public boolean comprarPasajeMetro(){
        Pasaje p = new PasajeMetro();

        if(saldo >= p.getValor()){
            viajesMetro.add(p);
            saldo -= p.getValor();
            return true;
        }

        return false;
    }

    public boolean comprarPasajeTaxi(){
        Pasaje p = new PasajeTaxi();
        if(saldo >= p.getValor()){
            viajesTaxi.add(p);
            saldo -= p.getValor();
            return true;
        }

        return false;
    }
}
