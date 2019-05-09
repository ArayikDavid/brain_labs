package ua.zp.brain.labs.oop.basics.packages.technics;

import java.util.Date;

public class Passport {
    private String model = "Samsung";
    private String name = "Phone";
    private Date warrantyStartDate;


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getWarrantyStartDate() {
        return warrantyStartDate;
    }

    public void setWarrantyStartDate(Date warrantyStartDate) {
        this.warrantyStartDate = warrantyStartDate;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "model='" + model + '\'' +
                ", name='" + name + '\'' +
                ", warrantyStartDate=" + warrantyStartDate +
                '}';
    }
}
