package Animall;

public class Main {

    public static void main(String[] args) {

        Animal[] animals = {new Shark(),new Turtle(),new Eagle()};
        
        for (Animal a:animals ) {
            if (a instanceof Shark) {
                ((Shark) a).attack();
            } else if (a instanceof Turtle) {
                ((Turtle) a).swim();
            } else if (a instanceof Eagle) {
                ((Eagle) a).fly();
            }
        }





    }
}
