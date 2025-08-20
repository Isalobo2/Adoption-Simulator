import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int AdopterAgeRequirement = 18;

        // Created an empty list that will store dog objects which can increase or decrease
        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(0, new Dog(2, "Peanut", "Chihuahua", "Beige", 'M', false, false, 10.23));
        dogs.add(1, new Dog(4, "Max", "Golden Retriever", "Dark Golden", 'M', true, false, 68.12));
        dogs.add(2, new Dog(1, "Daisy", "German Shepherd", "Black and Tan", 'F', true, false, 62.04));
        dogs.add(3, new Dog(2, "Sadie", "Beagle", "Brown", 'F', true, false, 16.22));

        // Created an empty list that will store dog objects which can increase or decrease
        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(0, new Cat("Siamese", "Luna", "Cream", 2, 'F', 8.2, true, false));
        cats.add(1, new Cat("Maine Coon", "Milo", "Gray", 4, 'M', 14.5, false, false));
        cats.add(2, new Cat("Tuxedo", "Oreo", "Black and white", 1, 'M', 11.41, false, true));
        cats.add(3, new Cat("Russian Blue", "Shadow", "Grey", 1, 'M', 9.10, false, false));

        // Scanner for user input
        Scanner input = new Scanner(System.in);

        System.out.println("Hello and welcome to Isabella's adoption center!");

        System.out.print("Enter your full name: ");
        String adopterName = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        if (age < AdopterAgeRequirement) {
            System.out.println("You do not meet the age requirements to adopt a pet.");
        } else {
            System.out.print("Enter your gender: ");
            char gender = input.next().charAt(0);

            System.out.print("Would you like to adopt a pet? y/n: ");
            char adoptChoice = input.next().charAt(0);
            if (adoptChoice == 'n' || adoptChoice == 'N') {
                System.out.println("No problem! Come visit us again.");
            }

            if (adoptChoice == 'y' || adoptChoice == 'Y') {
                System.out.print("Would you like to adopt a dog or a cat? Enter D or C: ");
                char petChoice = input.next().charAt(0);
                if (petChoice != 'd' && petChoice != 'D' && petChoice != 'c' && petChoice != 'C') {
                    System.out.println("Invalid choice. Please enter D or C.");
                }
                if (petChoice == 'D' || petChoice == 'd') {
                    System.out.println("\nAvailable Dogs:");
                    for (Dog dog : dogs) {
                        dog.displayInfo();

                    }
                    System.out.println("Enter the number of the dog you would like to adopt: ");
                    int dogNumber = input.nextInt(); //expecting user input to enter dog number
                    if (dogNumber < 1 || dogNumber > 4) {
                        System.out.println("Invalid Dog number. Please enter a  number between 1 and 4.");

                    }
                    if (dogNumber == 1) {
                        System.out.println("You have adopted Peanut!");
                    } else if (dogNumber == 2) {
                        System.out.println("You have adopted Max!");
                    } else if (dogNumber == 3) {
                        System.out.println("You have adopted Daisy!");
                    } else if (dogNumber == 4) {
                        System.out.println("You have adopted Sadie!");
                        if (petChoice == 'C' || petChoice == 'c') {
                            System.out.println("\nAvailable Cats:");
                            for (Cat cat : cats) {//displaying arraylist of all available cat objects
                                cat.displayInfo();
                                System.out.println("Enter the number of the cat you would like to adopt: ");
                                int catNumber = input.nextInt();
                                if (catNumber < 1 || catNumber > 4) {
                                    System.out.print("Invalid cat number. Please enter a  number between 1 and 4.");
                                    if (catNumber == 1) {
                                        System.out.println("You have adopted Luna!");
                                        if (catNumber == 2) {
                                            System.out.println("You have adopted Milo!");
                                            System.exit(0);
                                            if (catNumber == 3) {
                                                System.out.println("You have adopted Oreo!");
                                                if (catNumber == 4) {
                                                    System.out.println("You have adopted Shadow!");
                                                    ;
                                                }
                                            }
                                        }
                                    }

                                }
                            }
                        }
                    }
                }
            }
        }
    }
}






