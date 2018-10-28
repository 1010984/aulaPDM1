package com.example.tozesantos.utils;

public class Celsius extends Temperatura {

    /**
     * Transform Farhenheit to Celsius
     * @return
     */
    @Override
    public double getCelsius() {
        return super.valor;
    }

    /**
     * Transform Celsius to Farhenheit
     * @return
     */
    @Override
    public double getFarhenheit() {
        return super.valor * (9.0 / 5.0) + 32;
    }

    public Celsius(){
        super.valor = 0;
    }

    public Celsius(double valor){
        super.valor = valor;
    }
}
