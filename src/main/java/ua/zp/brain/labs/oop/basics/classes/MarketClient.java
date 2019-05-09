package ua.zp.brain.labs.oop.basics.classes;

public class MarketClient {
    String Client = "Vasilii";
    int callNumber = 06330;
    int money = 200;

    public String getClient() {
        return Client;
    }

    public void setClient(String client) {
        Client = client;
    }

    public int getCallNumber() {
        return callNumber;
    }

    public void setCallNumber(int callNumber) {
        this.callNumber = callNumber;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
