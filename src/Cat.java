

public class Cat {
    private double weight;
    private int age;
    private String color;
    private String name;
    public static int catCount;

    public Cat(){
       this("Barsik",3000,1,"Grey");
    }

    public Cat(String name, double weight, int age, String color){
        this.name =name;
        this.weight = weight;
        this.age = age;
        this.color = color;
        catCount++;
    }

    public Cat(double weight, int age, String color) {
        this("Empty",weight,age,color);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return  age;
    }

    public void setAge(int age) {
        if(age>this.age){
            this.age=age;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
        meow();meow();meow();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   public void meow(){

        System.out.println("Meow");
    }
    void pee(){

        weight-=20;
    }
    void eat(){
        weight+=50;
        if (50/weight>0.1){
            pee();
        }
    }


}
