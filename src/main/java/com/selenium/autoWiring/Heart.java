package com.selenium.autoWiring;

public class Heart {

    private String nameOfAnimal;
    private int noOfHearts;

    public int getNoOfHearts() {
        return noOfHearts;
    }

    public void setNoOfHearts(int noOfHearts) {
        this.noOfHearts = noOfHearts;
    }

    public String getNameOfAnimal() {
        return nameOfAnimal;
    }

    public void setNameOfAnimal(String nameOfAnimal) {
        this.nameOfAnimal = nameOfAnimal;
    }

    public void pump(){
        System.out.println("Heart is pumping..");
        System.out.println("This is life..");
    }
}
