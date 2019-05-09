package ua.zp.brain.labs.oop.basics.constructoress;

public class Test {
    public static void main(String[] args) {
        Circle s1 = new Circle(); //создаем объект
        Circle s2 = new Circle(50);
        System.out.println(s1.r);
        System.out.println(s2.r);
        System.out.println(s1.s);
        System.out.println(s2.s);
    }
}
