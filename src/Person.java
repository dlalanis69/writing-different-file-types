public class Person {
    //TODO 1: declare instance variables
    String name;
    int age;
    double weight;

    public Person(String name, int age, double weight) {
        //TODO 2: complete the constructor
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    public String toString() {
        //TODO 3: use the String.format() method to return string representation of the object
        String str = String.format("Name: %s\nAge: %d\nWeight: %.2f", this.name, this.age, this.weight);
        return str;
    }
}
