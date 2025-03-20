package test.soso;

import test.soso.Animal;

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}