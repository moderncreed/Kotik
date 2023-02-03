import animals.Kotik;

import static animals.Kotik.increment;

public class Application {


    public static void main(String[] args)
    {




        Kotik murka = new Kotik("Мурка", "Муррр", 5, 20);
        increment();
        Kotik barsik = new Kotik();
        increment();
        barsik.setName("Барсик");
        barsik.setVoice("Мяу");
        barsik.setSatiety(10);
        barsik.setWeight(30);

        murka.liveAnotherDay();

        barsik.liveAnotherDay();

        System.out.println("Вес " + murka.getName() + " равен " + murka.getWeight());
        System.out.println("Вес " + barsik.getName() + " равен " + barsik.getWeight());
        System.out.println(compaireVoice(murka,barsik));
    }
    public static boolean compaireVoice(Kotik a, Kotik b) {
        return a.getVoice().equals(b.getVoice());
    }

}