package ua.zp.brain.labs.oop.basics.classes;

public class PostOffice {

    public String Client = "Vasya";
    public int year = 21;
    final static public String adress = "40 soviet street";

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getClient() {
        return Client;
    }

    public void setClient(String client) {
        Client = client;
    }

    public static String getAdress() {
        return Adress;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    final static public String Adress = "prospect in zp";
    public String Name = "PostOffice";


}
