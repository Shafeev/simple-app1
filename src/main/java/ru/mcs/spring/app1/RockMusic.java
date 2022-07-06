package ru.mcs.spring.app1;

public class RockMusic implements Music {

    public void doInit() {
        System.out.println("Initialization");
    }

    public void doDestroy() {
        System.out.println("Destroy");
    }

    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}
