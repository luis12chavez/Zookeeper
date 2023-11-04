public class Gorilla extends Mammal {


    public Gorilla() {
        super(100);
        // this.energyLevel = energyLevel;
    }

    public void throwSomething() {
    System.out.println("Gorilla has gone on a rampage!"); 
    energyLevel -= 5;
    }

    public void eatBananas() {
        System.out.println("Gorilla has eaten enough bananas.");
        energyLevel += 10;
    }

    public void climb() {
        System.out.println("Gorilla is now at the top of the tree!");
        energyLevel -= 10;
    }
}