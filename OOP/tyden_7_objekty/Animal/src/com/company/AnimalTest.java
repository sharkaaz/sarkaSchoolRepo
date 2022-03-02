package com.company;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
    private Animal animal;

    @BeforeEach
    public void createAnimal() {
        animal = new Animal();
    }

    @org.junit.jupiter.api.Test
    void eat() {
animal.eat();
assertEquals(49, animal.hunger);
    }

    @org.junit.jupiter.api.Test
    void drink() {
        animal.drink();
        assertEquals(49, animal.thirst);
    }

    @org.junit.jupiter.api.Test
    void play() {
        animal.play();
        assertEquals(51, animal.hunger);
        assertEquals(51, animal.thirst);
    }
}