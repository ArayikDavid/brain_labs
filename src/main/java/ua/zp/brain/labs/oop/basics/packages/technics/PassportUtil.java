package ua.zp.brain.labs.oop.basics.packages.technics;


import java.util.Date;

public class PassportUtil {
    private PassportUtil() {

    }

    public static void warrantyReplace(Passport doc) {
        doc.setWarrantyStartDate(new Date());


    }

    public static void main(String[] args) {
        Passport pas = new Passport();
        pas.setWarrantyStartDate(new Date(12345));
        System.out.println(pas);
        warrantyReplace(pas);
        System.out.println(pas);
    }
}
