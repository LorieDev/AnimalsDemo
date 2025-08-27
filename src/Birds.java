public class Birds {

    //Field
    private String name;
    private int manyOfWings;
    private double pounds;

    //Constructor
    public Birds(String name, int manyOfWings, double pounds){
        this.name = name;
        this.manyOfWings = manyOfWings;
        this.pounds = pounds;
    }

    //Getter
    public String getName(){
        return name;
    }
    public int getManyOfWings(){
        return manyOfWings;
    }
    public double getPounds(){
        return pounds;
    }

    //Setter
    public void setName(String name){
        this.name = name;
    }
    public void setManyOfWings(int manyOfWings){
        this.manyOfWings = manyOfWings;
    }
    public void setPounds(double pounds){
        this.pounds = pounds;
    }

    //Custom method
    public void blueBird(){
        System.out.println("My bird: " + name);
    }

    //Overloaded
    public void BirdFly(String action){
        System.out.println("My bird: " + name + " can fly.");
    }

    //Display message
    public void PrintInfo(){
        System .out.println("My bird name is: " + name);
        System .out.println("My bird has: " + manyOfWings + " its can fy.");
        System .out.println("My bird pound is: " + pounds);
    }
}
