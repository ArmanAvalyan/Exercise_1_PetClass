package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Pet pet = new Pet();
        System.out.print("Enter the type of animal: ");
        pet.setAnimal(scanner.nextLine());
        System.out.print("Enter the name of animal: ");
        pet.setName(scanner.nextLine());
        System.out.print("Enter the age of animal: ");
        pet.setAge(scanner.nextInt());
        System.out.println(pet.getAnimal() + "\n" + pet.getName() + "\n" + pet.getAge());

        Pet pet1 = new Pet("dog", "Max", 4);
        System.out.println(pet1.getAnimal() + "\n" + pet1.getName() + "\n" + pet1.getAge());
    }
}
