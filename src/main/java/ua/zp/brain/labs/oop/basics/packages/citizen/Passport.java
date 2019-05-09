package ua.zp.brain.labs.oop.basics.packages.citizen;

public class Passport {
    private String name = "Vasya";
    private String lastName = "Ivanov";
    private int i = 18;
    private int passportId = 123456;
    private int spouseld;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getPassportId() {
        return passportId;
    }

    public void setPassportId(int passportId) {
        this.passportId = passportId;
    }

    public int getSpouseld() {
        return spouseld;
    }

    public void setSpouseld(int spouseld) {
        this.spouseld = spouseld;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", i=" + i +
                ", passportId=" + passportId +
                ", spouseld=" + spouseld +

                '}';
    }
}
