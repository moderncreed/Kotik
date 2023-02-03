package animals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Kotik {

    private String name;
    private String voice;
    private int satiety;
    private int weight;
    private static int count;



    private final static int METHODS = 5;




    public Kotik(String name, String voice, int satiety, int weight) {
        this.name = name;
        this.voice = voice;
        this.satiety = satiety;
        this.weight = weight;
    }

    public Kotik() {
    }

    public void eat(int satiety) {
        setSatiety(++satiety);
    }

    public void eat(int satiety, String food) {

    }

    public void eat() {
        eat(3,"Рыбка");
    }

    public static int getRandom() {
        return  (int) (Math.random() * METHODS) + 1;
    }

    public String[] liveAnotherDay() {
        String[] does = new String[24];
        for (int i = 0; i < 24; i++){
        int random = (int) (Math.random() * METHODS) + 1;
        switch (random) {
            case (1):
                does[i] = "Играет";
                play();
                if (!play()) {
                    eat(5);
                }
                break;
            case (2):
                does[i] = "Спит";
                sleep();
                if (!sleep()) {
                    eat(5);
                }
                break;
            case (3):
                does[i] = "Умывается";
                wash();
                if (!wash()) {
                    eat(5);
                }
                break;
            case (4):
                does[i] = "Гуляет";
                walk();
                if (!walk()) {
                    eat(5);
                }
                break;
            case (5):
                does[i] = "Охотится";
                hunt();
                if (!hunt()) {
                    eat(5);
                }
                break;
        }
        }
        for (int i = 0; i < 24; i++){
            System.out.println(i + " " + does[i]);
        }
        return does;
    }

    public boolean play() {
        if (getSatiety() > 0) {
            System.out.println(getName() + " играет");
            setSatiety(--satiety);
            return true;
        } else {
            System.out.println(getName() + " хочет есть");
            return false;
        }
    }

    public boolean sleep() {
        if (getSatiety() > 0) {
            System.out.println(getName() + " спит");
            setSatiety(--satiety);
            return true;
        } else {
            System.out.println(getName() + " хочет есть");
            return false;
        }
    }

    public boolean wash() {
        if (getSatiety() > 0) {
            System.out.println(getName() + " умывается");
            setSatiety(--satiety);
            return true;
        } else {
            System.out.println(getName() + " хочет есть");
            return false;
        }
    }

    public boolean walk() {
        if (getSatiety() > 0) {
            System.out.println(getName() + " гуляет");
            setSatiety(--satiety);
            return true;
        } else {
            System.out.println(getName() + " хочет есть");
            return false;
        }
    }

    public boolean hunt() {
        if (getSatiety() > 0) {
            System.out.println(getName() + " охотится");
            setSatiety(--satiety);
            return true;
        } else {
            System.out.println(getName() + " хочет есть");
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCount() {
        return count;
    }

    public static void increment() {
        count++;
    }


}
