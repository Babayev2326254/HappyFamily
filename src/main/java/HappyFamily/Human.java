package HappyFamily;

import java.util.Random;

public class Human extends Pet {
    private String name;
    private String surname;
    private int yearOfBirth;
    private int iq;
    private Pet pet;
    private Human mother;
    private Human father;
    private String[][] schedule;


    public Human(String name, String surname, int yearOfBirth) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
    }


    public Human(String name, String surname, int yearOfBirth, Human mother, Human father) {
        this(name, surname, yearOfBirth); // Call the previous constructor
        this.mother = mother;
        this.father = father;
    }


    public Human(String name, String surname, int yearOfBirth, int iq, Pet pet, Human mother, Human father, String[][] schedule) {
        this(name, surname, yearOfBirth, mother, father); // Call the second constructor
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

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
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
                ", mother=" + (mother != null ? mother.getName() + " " + mother.getSurname() : "N/A") +
                ", father=" + (father != null ? father.getName() + " " + father.getSurname() : "N/A") +
                ", pet=" + (pet != null ? pet.toString() : "No pet") +
                '}';
    }
}
