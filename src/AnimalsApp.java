public class AnimalsApp {
    public static void main(String [] args){

        //Create objects
        Dog myDog = new Dog("Fredo", 6, 12.8);
        Cat myCat = new Cat("Love",  4, 9.6);
        Birds myBirds = new Birds("Bijou", 2, 4.2);

        //Call the methods
        myDog.printInfo();
        myDog.DogBark();
        myDog.DogRunning("Miles");

        myCat.catAction();
        myCat.displayInfo();
        myCat.makeSound("Ouf");

        myBirds.BirdFly("High");
        myBirds.blueBird();
        myBirds.PrintInfo();



    }
}
