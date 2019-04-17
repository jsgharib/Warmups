package warmups;

public class Warmups {
    public static void main(String[] args) {
         //4/15
          doggo dogger = new doggo("Doggy");
          cat catter = new cat("Cleo");
          doggo borker = new doggo("borker");
          cat catty = new cat("Hank");
          Kennel pound = new Kennel();
          dogger.sleep();
          dogger.eat();
          dogger.bork();
          catter.eat();
          catter.sleep();
          catter.meow();
          pound.addAnimal(dogger);
          pound.addAnimal(catty);
          pound.addAnimal(borker);
          pound.addAnimal(catter);
          System.out.println("Before Sort: " + pound.toString());
          pound.sortAnimals();
          System.out.println("After Sort: " + pound.toString());
    }
    
}
