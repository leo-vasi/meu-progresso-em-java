package com.leo.application;

import entities.Animal;
import entities.Bird;
import entities.Dog;

public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Dog();
        Animal passaro = new Bird();

        System.out.println("Interagindo com o cachorro:");
        cachorro.falar();
        cachorro.andar();

        System.out.println("\nInteragindo com o pássaro:");
        passaro.falar();
        passaro.andar();

        System.out.println("\nInteragindo com vários animais:");
        Animal[] zoo = {cachorro, passaro};
        for (Animal animal : zoo) {
            animal.falar();
            animal.andar();
        }
    }
}
