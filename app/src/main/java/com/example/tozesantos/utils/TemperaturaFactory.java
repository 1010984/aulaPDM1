package com.example.tozesantos.utils;

public class TemperaturaFactory {

    public static Temperatura Celsius(double value){
        return new Celsius(value);
    }

    public static Temperatura Farhenheit(double value){
        return new Farhenheit(value);
    }

    public static Temperatura Celsius(){
        return new Celsius();
    }

    public static Temperatura Farhenheit(){
        return new Farhenheit();
    }
}
