package com.hillel.homework2;

public class Car {
    public static void start(){
        startElectricity();
        startCommand();
        startFuelSystem();
    }
    private static void startElectricity(){
        System.out.println("Старт Електроніки");
    }
    private static void startCommand(){
        System.out.println("Старт Команд");
    }
    private static void startFuelSystem(){
        System.out.println("Старт топливної системи");
    }
}
