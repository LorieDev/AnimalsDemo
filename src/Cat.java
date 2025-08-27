public class Cat {

    //Field
    private String name;
    private int manyOfLegs;
    private double pounds;

    //Constructor
    public Cat(String name, int manyOfLegs, double pounds){
        this.name = name;
        this.manyOfLegs = manyOfLegs;
        this.pounds = pounds;
    }

    //Getter
    public String getName() {
        return name;
    }
    public int getManyOfLegs(){
        return manyOfLegs;
    }
    public double getPounds(){
        return pounds;
    }

    //Setter
    public void setName(String name){
        this.name = name;
    }
    public void setManyOfLegs(int manyOfLegs) {
        this.manyOfLegs = manyOfLegs;
    }
    public void setPounds(double pounds) {
        this.pounds = pounds;
    }

    //custom method
    public void catAction(){
        System.out.println("My cat is: " + name);
    }

    //Overloaded
    public void makeSound(String sound){
        System.out.println("My cat: " + name + " make sound" + sound);
    }

    //Display info
    public void displayInfo(){
        System.out.println("My cat name is: " + name);
        System.out.println("My cat has"  + manyOfLegs + " manyOfLegs");
        System.out.println("My cat pounds is: " + pounds);
    }
}
