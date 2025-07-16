public class Cat {
    String breed;
    String name;
    String color;
    int age;
    char gender;
    double weight;
    boolean isFixed;
    boolean isAdopted;

    // Constructor
    public Cat(String breed, String name, String color, int age, char gender, double weight, boolean isFixed, boolean isAdopted) {
        this.breed = breed;
        this.name = name;
        this.color = color;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
        this.isFixed = isFixed;
        this.isAdopted = isAdopted;
    }

    // Instance method (NOT static)
    public void displayInfo() {
        System.out.println("Cat Name: " + name);
        System.out.println("Breed: " + breed);
        System.out.println("Color: " + color);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Weight: " + weight);
        System.out.println("Fixed: " + isFixed);
        System.out.println("Adopted: " + isAdopted);
        System.out.println();
    }
}
