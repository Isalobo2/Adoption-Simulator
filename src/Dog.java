//making a dog class with different attributes
public class Dog {
    int age;
    String name;
    String color;
    String breed;
    char gender;
    boolean isFixed;
    boolean isAdopted;
    double weight;
    // constructor aka special method creating dog object with values or properties
    public Dog(int age, String name, String breed, String color, char gender, boolean isFixed,boolean isAdopted,double weight) {
        this.age = age;
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.gender = gender;
        this.isFixed = isFixed;
        this.isAdopted = isAdopted;
        this.weight = weight;
    }
    public void displayInfo(){
        System.out.println("Dog Age: "+age);
        System.out.println("Dog Name: "+name);
        System.out.println("Dog Breed: "+ breed);
        System.out.println("Dog Color: "+color);
        System.out.println("Dog Gender: "+gender);
        System.out.println("Dog IsFixed: "+isFixed);
        System.out.println("Dog IsAdopted: "+isAdopted);
        System.out.println("Dog Weight: "+weight);
        System.out.println();

    }
    }

