public class Main {
    public static void main(String[] args) {

        Noodle noodle = new Noodle(100);
        System.out.println(noodle.calculateQuantityFor100Gramm());
        noodle.boil();

        Pork pork = new Pork(200);
        System.out.println(pork.calculateQuantityFor100Gramm());
        pork.stew();

        Mushroom mushroom = new Mushroom(300);
        System.out.println(mushroom.calculateQuantityFor100Gramm());
        mushroom.fry();


    }
}
