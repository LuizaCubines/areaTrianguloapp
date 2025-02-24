package com.example.areatrianguloapp;

public class Area {
    private double base;
    private double altura;

    //contrutores
    public Area(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    //metodo
    public double calcular(){return base*altura /2;}
}
