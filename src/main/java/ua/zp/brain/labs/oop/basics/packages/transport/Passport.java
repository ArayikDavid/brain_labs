package ua.zp.brain.labs.oop.basics.packages.transport;

import javax.xml.crypto.Data;

public class Passport {
    private String name = "Car";
    private String model = "Lanos";
    private int dataCreate = 2002;
    private String ownerName;



    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDataCreate() {
        return dataCreate;
    }

    public void setDataCreate(int dataCreate) {
        this.dataCreate = dataCreate;
    }


    @Override
    public String toString() {
        return "Passport{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", dataCreate=" + dataCreate +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}
