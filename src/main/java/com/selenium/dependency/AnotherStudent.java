package com.selenium.dependency;

public class AnotherStudent {

    private Cheat cheat;

    public void setCheat(Cheat cheat) {
        this.cheat = cheat;
    }

    public void anotherStudentCheating(){
        cheat.cheat();
    }
}
