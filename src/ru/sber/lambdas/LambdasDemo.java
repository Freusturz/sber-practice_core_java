package ru.sber.lambdas;

import java.util.ArrayList;
import java.util.List;

public class LambdasDemo {

    private void whaleSound() {
        System.out.println("sing");
    }

    private static void sheepSound() {
        System.out.println("bleat");
    }

    public static void main(String[] args) {
        List<Sounding> soundings = new ArrayList<>();

        soundings.add(new Cat());
        soundings.add(new Cattle());
        soundings.add(new Chicken());

        for (Sounding sounding : soundings) {
            sounding.sound();
        }

        soundings.add(new Sounding() /* Chinchilla */ {
            @Override
            public void sound() {
                System.out.println("squeak");
            }
        });

        /* Wolf */
        soundings.add(() -> System.out.println("AYF"));

        LambdasDemo demo = new LambdasDemo();
        soundings.add(demo::whaleSound);
        soundings.add(LambdasDemo::sheepSound);

        soundings.forEach(Sounding::sound);
    }

}
