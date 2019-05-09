package ua.zp.brain.labs.oop.basics.packages.transport;

public class PassportUtil {
    private PassportUtil(){

    }
    public static Passport changeOwner(String newOwner,Passport oldPassport){
        Passport pass = new Passport();
        pass.setOwnerName(newOwner);
        pass.setName(oldPassport.getName());
        pass.setModel(oldPassport.getModel());



        return pass;
    }
}
