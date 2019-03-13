package cjc.ares.designpattern.temple;

public class Test {
    public static void main(String[] args) {
        DodishTemplate eggWithTomato = new EggsWithTomato();
        DodishTemplate bouilli = new Bouilli();

        eggWithTomato.dodish();

        System.out.println("===============");

        bouilli.dodish();
    }
}
