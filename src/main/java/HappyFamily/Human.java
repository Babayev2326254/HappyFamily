package HappyFamily;

import java.util.Random;

public class Human extends Pet {
    private String name;
    private String surname;
    private int yearOfBirth;
    private int iq;
    private Pet pet;
    private Family family;
    private String[][] schedule;


    public Human(String name, String surname, int yearOfBirth, int iq, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.iq = iq;
        this.schedule = schedule;
    }


    public Human(String name, String surname, int yearOfBirth, int iq, Pet pet, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.iq = iq;
        this.pet = pet;
        this.schedule = schedule;
    }


    public Human() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }


    public void greetPet() {
        System.out.println("Hello, " + getName());
    }


    public void describePet() {
        if (getAge() > 50) {
            System.out.println("I have a " + pet.getSpecies() + " who is " + pet.getAge() + " years old. It is very sly.");
        } else {
            System.out.println("I have a " + pet.getSpecies() + " who is " + pet.getAge() + " years old. It is almost not sly.");
        }
    }


    public boolean feedPet(boolean isFeedingTime) {
        if (isFeedingTime) {
            System.out.println("Hm... I will feed " + pet.getNickname() + "'s " + pet.getSpecies());
            return true;
        } else {
            Random random = new Random();
            int randomInt = random.nextInt(100) + 1; // Generate random number from 1 to 100
            if (getTricklevel() > randomInt) {
                System.out.println("Hm... I will feed " + pet.getNickname() + "'s " + pet.getSpecies());
                return true;
            } else {
                System.out.println("I think " + pet.getNickname() + " is not hungry.");
                return false;
            }
        }
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", iq=" + iq +
                '}';
    }
}
