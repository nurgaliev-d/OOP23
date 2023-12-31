package labWork1;

import java.util.Vector;


public class DragonLaunch {
 private Vector<Person> kidnappedPeople;

 public DragonLaunch() {
     kidnappedPeople = new Vector<>();
 }

  public void kidnap(Person person) {
     kidnappedPeople.add(person);
 }

  public boolean willDragonEatOrNot() {
     int remainingPairs = 0;

          for (Person person : kidnappedPeople) {
         if (person.getGender() == Gender.BOY) {
             remainingPairs++;
         } else {
             if (remainingPairs > 0) {
                 remainingPairs--;
             } else {
                 return false;              }
         }
     }

          return remainingPairs == 0;
 }

 public static void main(String[] args) {
     DragonLaunch dragonLaunch = new DragonLaunch();

     dragonLaunch.kidnap(new Person(Gender.BOY));
     dragonLaunch.kidnap(new Person(Gender.BOY));
     dragonLaunch.kidnap(new Person(Gender.GIRL));
     dragonLaunch.kidnap(new Person(Gender.GIRL));

          boolean dragonWillEat = !dragonLaunch.willDragonEatOrNot();
     System.out.println("Dragon will eat: " + dragonWillEat);

          dragonLaunch = new DragonLaunch();
     dragonLaunch.kidnap(new Person(Gender.BOY));
     dragonLaunch.kidnap(new Person(Gender.GIRL));
     dragonLaunch.kidnap(new Person(Gender.BOY));
     dragonLaunch.kidnap(new Person(Gender.GIRL));
     dragonLaunch.kidnap(new Person(Gender.GIRL));


          dragonWillEat = !dragonLaunch.willDragonEatOrNot();
     System.out.println("Dragon will eat: " + dragonWillEat);
 }
}