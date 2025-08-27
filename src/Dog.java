

public class Dog {

    //Field
    private String name;
    private int age;
    private double pounds;

    //Constructor
    public Dog(String name, int age, double pounds){
        this.name = name;
        this.age = age;
        this.pounds = pounds;
    }

    //Getter
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public double getPounds(){
        return pounds;
    }

    //Setter
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setPounds(double pounds){
        this.pounds = pounds;
    }

    //Custom methods
    public void DogBark(){
        System.out.println("My dog: " + name + "ouf ouf.");
    }

    //Overloaded
    public void DogRunning(String speed){
        System.out.println("My dog is running fast: " + name);
    }

    //Display message
    public void printInfo(){
        System.out.println("My dog name is: " + name);
        System.out.println("My dog age is: " + age);
        System.out.println("My dog pounds is: " + pounds);


    }

}
