package com.codeinterview;

public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public Person(String name) throws Exception {
       if (name.length() == 0) {
           throw new Exception("A name of the person cannot be whitespace.");
       } else {
           this.name = name;
       }
    }

    public void eat(Food food) {
        System.out.printf("My name is %s and I am eating %s.\nMore detail about the food: %s.", this.name, food.getName(), food.toString());
    }
}
