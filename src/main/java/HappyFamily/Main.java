package HappyFamily;

public class Main {
    public static void main(String[] args) {

        String[] petHabits = {"eat", "drink", "sleep"};
        Pet pet = new Pet("dog", "Rock", 5, 75, petHabits);


        String[][] schedule = {
                {"Monday", "Study"},
                {"Tuesday", "Exercise"},
                {"Wednesday", "Play"}
        };
        Human child = new Human("Michael", "Karleone", 2000, 90, pet, schedule);

        child.greetPet();
        child.describePet();

        pet.eat();
        pet.respond();
        pet.foul();

        System.out.println(child);
        System.out.println(pet);
        child.feedPet(true);
        child.feedPet(false);
    }
}

