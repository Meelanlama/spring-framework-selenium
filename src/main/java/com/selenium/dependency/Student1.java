package com.selenium.dependency;

public class Student1 {

    private Cheat cheat;

    public void setCheat(Cheat cheat) {
        this.cheat = cheat;
    }

    public void studentCheating(){
       cheat.cheat();
    }
}
