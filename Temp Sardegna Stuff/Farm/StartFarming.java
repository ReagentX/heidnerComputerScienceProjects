
// Chris Sardegna Period 5
import static java.lang.System.*;

public class StartFarming
{
   public static void main(String[] args)
   {
      Turkey turkey = new Turkey();
      turkey.speak();
      turkey.sayName();
      turkey.eatSeed();
      turkey.peckWood();
      turkey.foxSpeak();
      
      Dog dog = new Dog();
      dog.bark();
      dog.sayName();
      dog.eatFood();
      dog.biteToy();
      dog.cowSpeak();
      
      Cow cow = new Cow();
      cow.moo();
      cow.speakName();
      cow.lickHair();
      cow.eatFoods();
      cow.foxSpeak();
      
      Elephant phat = new Elephant();
      phat.trumpet();
      phat.honkLoud();
      phat.eatLeaves();
      phat.whipTrunk();
      phat.whatDoesTheFoxSay();
      
      Goat goat = new Goat();
      goat.screech();
      goat.spit();
      goat.lickFur();
      goat.eatMeal();
      goat.foxSpeak();
      
      Horse horse = new Horse();
      horse.neigh();
      horse.spit();
      horse.lickFur();
      horse.eatMeal();
      horse.foxSpeak();
   }
}