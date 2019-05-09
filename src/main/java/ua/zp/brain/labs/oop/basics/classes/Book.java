package ua.zp.brain.labs.oop.basics.classes;

public class Book {
    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public static int getYear() {
        return year;
    }

    public int pageNum = 768;
    public String Name = "hamlet";
    final static public int year = 1955;


}

