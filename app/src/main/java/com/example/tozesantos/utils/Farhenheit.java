package com.example.tozesantos.utils;

public class Farhenheit extends Temperatura {


    @Override
    public double getCelsius() {
        return (super.valor - 32.0) / (9.0 / 5.0);
    }

    @Override
    public double getFarhenheit() {
        return super.valor;
    }

    public Farhenheit(){
        super.valor = 0;
    }
    
    public Farhenheit(double valor){
        super.valor = valor;
    }
}
