public class Bat extends Mammal {

    public Bat() {
        // super(300);
        energyLevel = 300;
    }

    public void fly() {
        System.out.println("The bat has gone airborne!");
        energyLevel -= 50;
    }

    public void eatHumans() {
        System.out.println("The bat just ate another human!");
        energyLevel += 25;
    }

    public void attackTown() {
        System.out.println("The bat has gone after the village!");
        energyLevel -= 100;
    }
}
