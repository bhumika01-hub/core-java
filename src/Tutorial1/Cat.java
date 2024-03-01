package Tutorial1;

public class Cat extends Dog{

    private int food;
    public Cat(String name, int age, int food) {
        super(name, age);
        this.food=food;
    }
    public void speak(){
        System.out.println("Meow !! I am "+this.name+ " and I am " + this.age+ " years old" + " & I get fed " + this.food + " grams of food");

    }
}
