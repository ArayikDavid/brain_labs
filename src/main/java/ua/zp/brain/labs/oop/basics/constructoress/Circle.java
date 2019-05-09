package ua.zp.brain.labs.oop.basics.constructoress;

public class Circle {
    double r; // радиус
    double C; // длина окружности
    double s; // площадь
    String color = "Black";

    public Circle(double r) {//обьявление радиуса
        this.r = r;
        square();

    }

    public Circle() { //обьявление радиуса и цвета
        r = 10;
        color = "Черный";
        square();
    }
    public void square(){
        this.s = r*r*Math.PI;

    }
}

