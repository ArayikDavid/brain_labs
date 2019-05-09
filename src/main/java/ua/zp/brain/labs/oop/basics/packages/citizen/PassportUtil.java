package ua.zp.brain.labs.oop.basics.packages.citizen;

public class PassportUtil {
    private PassportUtil() {

    } //Закрытый конструктор
    public static void marriageRegistrate(Passport ID1, Passport ID2){
        ID1.setSpouseld(ID2.getPassportId());
        ID2.setSpouseld(ID1.getPassportId());

    }

    public static void main(String[] args) {
        Passport husb = new Passport();
        Passport husb2 = new Passport();
        husb.setPassportId(111111);
        husb2.setPassportId(222222);
        marriageRegistrate(husb,husb2);
        System.out.println(husb);
        System.out.println(husb2);
    }


}


