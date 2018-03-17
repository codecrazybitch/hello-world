package com.codeinterview;

public class Main {

    public static void main(String[] args) throws Exception {
        Person customer = new Person("JiaZheng");

        Noodle noodle = new Noodle(3.5, NoodleType.Wide);

        customer.eatFood(noodle);
    }
}
