public class Test {
    public static void main(String[] args) {
       
        Mammal mammal1 = new Mammal(500);
        mammal1.displayEnergy();
        Mammal m2 = new Mammal();
        m2.displayEnergy();
        
        
        // Gorilla g1 = new Gorilla();
        // g1.displayEnergy();
        // g1.throwSomething();
        // g1.throwSomething();
        // g1.displayEnergy();

        Gorilla g2 = new Gorilla();
        System.out.println("\n\ng2 Test:");
        g2.displayEnergy();
        g2.throwSomething();
        g2.throwSomething();
        g2.throwSomething();
        g2.eatBananas();
        g2.eatBananas();
        g2.climb();
        g2.displayEnergy();
        System.out.println("\n\n");


        Bat bat1 = new Bat();
        bat1.displayEnergy();
        bat1.attackTown();
        bat1.attackTown();
        bat1.attackTown();
        bat1.eatHumans();
        bat1.eatHumans();
        bat1.fly();
        bat1.fly();
        bat1.displayEnergy();
    }


    
}
