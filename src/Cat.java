public class Cat {
    double weight;
    int age;
    String color;
    String name;
    public Cat(){
       this("Barsik",3000,1,"Grey");
    }

    public Cat(String name, double weight,int age,String color){
        this.name =name;
        this.weight = weight;
        this.age = age;
        this.color = color;
    }

    public Cat(double weight, int age, String color) {
        this.weight = weight;
        this.age = age;
        this.color = color;
    }

    void meow(){
        System.out.println("Meow");
    }
    void pee(){
        weight-=20;
    }
    void eat(){
        weight+=50;
    }

}
